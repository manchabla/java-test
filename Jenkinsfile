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
    }
}