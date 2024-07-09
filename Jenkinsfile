pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
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