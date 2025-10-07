pipeline {
    agent any

    tools {
        maven 'Maven_3.9' // Replace with your Maven tool name in Jenkins
        jdk 'JDK_17'      // Replace with your configured JDK
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
                sh 'java -cp target/jenkins-demo-1.0-SNAPSHOT.jar Hello'
                sh 'echo Build_OK > artifact.txt'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'artifact.txt, target/**', allowEmptyArchive: false
        }
    }
}
