pipeline {
    agent any

    tools {
        maven 'Maven_3.9'
        jdk 'JDK_17'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Compile manually since Maven won't detect sources
                sh 'javac -d target src/main/java/Hello.java'
                // Create JAR manually
                sh 'jar cf target/jenkins-demo-1.0-SNAPSHOT.jar -C target .'
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
