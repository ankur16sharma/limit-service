pipeline {
	agent any

	tools {
		maven 'jenkins-maven'
		jdk 'JDK-17'
	}

	stages {

		stage('Build'){
			steps {
				bat "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				bat "mvn test"
			}
		}

		stage('Deploy') {
			steps {
			    bat "mvn jar:jar deploy:deploy -DuniqueVersion=false"
			}
		}
	}
}