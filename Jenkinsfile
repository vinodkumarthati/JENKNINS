pipeline {
    agent any
    tools {
        maven 'Maven_3.9'  // Use the Maven you configured in Jenkins
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Run') {
            steps {
                sh 'java -cp target/myapp-1.0-SNAPSHOT.jar com.example.App'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/*.jar', allowEmptyArchive: false
        }
    }
}
