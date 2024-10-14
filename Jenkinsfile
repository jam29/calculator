pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/jam29/calculator.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }



        stage('Deploy') {
            steps {
                echo 'Deploy stage - Add deployment steps here'
            }
        }
    }

    post {
        success {
            echo 'Build, Test, and SonarQube analysis completed successfully.'
        }
        failure {
            echo 'Build failed. Please check the logs for details.'
        }
    }
}
