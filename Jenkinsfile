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
                sh """
                rm -rf out
                mkdir -p out
                javac -d out src/hello/Hello.java
                """
            }
        }
        stage('Run') {
            steps {
                sh """
                java -cp out hello.Hello
                echo Build_OK > artifact.txt
                """
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'artifact.txt, out/**', allowEmptyArchive: false
        }
    }
}
