pipeline {
    agent any

    triggers {
        pollSCM('*/1 * * * *')
    }

    tools {
        maven 'Maven-3.9.16'
    }

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Application Deployed Successfully'
            }
        }
    }

    post {
        success {
            echo 'Pipeline Success'
        }

        failure {
            echo 'Pipeline Failed'
        }
    }
}
