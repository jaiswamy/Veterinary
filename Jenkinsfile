pipeline {
    agent any

    triggers {
        githubPush()
    }

    environment {
        DOCKER_IMAGE = "jaicswamy962/veterinaryimage:latest"
        AWS_HOST = "65.0.65.185"
    }

    stages {
        stage('Checkout Code') {
            steps {
                 checkout([
                     $class: 'GitSCM',
                     branches: [[name: '*/main']],
                     userRemoteConfigs: [[
                         url: 'git@github.com:jaiswamy/Veterinary.git',
                         credentialsId: 'git-credentials'
                     ]]
                 ])
            }
        }

        stage('Build and Push Docker Image') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-credentials',
                    usernameVariable: 'DOCKERHUB_USERNAME',
                    passwordVariable: 'DOCKERHUB_PASSWORD'
                )]) {
                    sh '''
                    docker-compose build --no-cache
                    docker tag javaapp $DOCKER_IMAGE
                    echo "$DOCKERHUB_PASSWORD" | docker login -u "$DOCKERHUB_USERNAME" --password-stdin
                    docker push $DOCKER_IMAGE
                    '''
                }
            }
        }

        stage('Deploy to AWS') {
            steps {
                sshagent(['aws-ssh-key']) {
                    sh """
                    ssh -o StrictHostKeyChecking=no ubuntu@${AWS_HOST} '
                        if [ ! -d ~/Veterinary ]; then
                            git clone https://github.com/jaiswamy/Veterinary.git
                        else
                            cd ~/Veterinary && git pull origin main
                        fi
                        cd ~/Veterinary
                        docker pull ${DOCKER_IMAGE} && echo "Docker image pulled successfully"
                        docker compose up -d --force-recreate && echo "Docker Compose containers started successfully"
                        docker image prune -f
                    '
                    """
                }
            }
        }
    }
}
