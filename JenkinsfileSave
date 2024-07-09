pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', credentialsId: 'gitcredentials', url: 'https://github.com/jam29/calculator.git'
            }
        }

        stage('Build') {
            steps {
                // Build the Spring Boot application
                sh './mvnw clean install'
            }
        }

        stage('Test') {
            steps {
                // Run the tests
                sh './mvnw test'
            }
        }

        stage('Package') {
            steps {
                // Package the application
                sh './mvnw package'
            }
        }

    }

    post {
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}