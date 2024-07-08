pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                git 'https://github.com/jam29/calculator.git'
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

        stage('Deploy') {
            steps {
                // Example deployment step, adjust as necessary
                // sh 'scp target/*.jar user@your-server:/path/to/deploy'
                echo "coucou"
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