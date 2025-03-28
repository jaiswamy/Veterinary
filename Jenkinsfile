pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "jaicswamy962/javaapp:latest"
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'git@github.com:your-repo.git'
            }
        }

        stage('Build Grails WAR') {
            steps {
                sh '''
                cd VETBIDATCOL
                ./grailsw war
                '''
            }
        }

        stage('Build Docker Image') {
            steps {
                sh '''
                docker build -t $DOCKER_IMAGE -f Docker-file/app/Dockerfile .
                docker login -u $DOCKERHUB_USERNAME -p $DOCKERHUB_PASSWORD
                docker push $DOCKER_IMAGE
                '''
            }
        }

        stage('Deploy to AWS') {
            steps {
                sshagent(['aws-ssh-key']) {
                    sh '''
                    ssh ubuntu@${AWS_HOST} <<EOF
                    cd ~/Veterinary
                    docker-compose pull
                    docker-compose up -d --force-recreate
                    docker system prune -af
                    EOF
                    '''
                }
            }
        }
    }
}
