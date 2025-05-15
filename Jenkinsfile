pipeline {
    agent any

    tools {
        maven 'Maven'  // Replace with actual tool names from Jenkins configuration
        jdk 'JDK'
    }

    stages {
        stage('Checkout') {
            steps {
                git "https/github.com/Thushardm/1BI22CS174-MavenSelenium"
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

        stage('Run') {
            steps {
                sh 'mvn exec:java -Dexec.mainClass=com.example.App'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
