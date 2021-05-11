pipeline {
    agent any
    stages {
        stage('Clean and Compile') {
            steps {
				sh "mvn clean compile "
			}
        }
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
        stage('Create JAR') {
            steps {
                sh "mvn package"
            }
        }

        stage('Build Docker image'){
            steps {
                sh 'docker build -t  manchabla/maven-docker-jenkins .'
            }
        }

        stage('Docker deploy'){
           steps {
                sh 'docker run -itd -p  3000:3001 manchabla/maven-docker-jenkins'
           }
        }

        stage('Archving') {
            steps {
                archiveArtifacts '**/target/*.jar'
            }
        }
    }
}
