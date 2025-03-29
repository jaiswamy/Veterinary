pipeline {
    agent any

    triggers {
        githubPush()
    }

    environment {
        DOCKER_IMAGE = "jaicswamy962/javaapp:latest"
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'git@github.com:jaiswamy/Veterinary.git', credentialsId: 'github-ssh-key'
            }
        }

        stage('Build and Push Docker Image') {
            steps {
                sh '''
                cd Docker-file/app
                docker-compose build
                docker login -u $DOCKERHUB_USERNAME -p $DOCKERHUB_PASSWORD
                docker-compose push
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
