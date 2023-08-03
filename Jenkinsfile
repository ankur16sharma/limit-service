pipeline {
	agent any

	environment {
		mavenHome = tool 'jenkins-maven'
	}

	tools {
		jdk 'JDK-17'
	}

	stages {

		stage('Build'){
			steps {
				bat "C:\Users\ankur\Documents\workspaceNewEclipse\apache-maven-3.9.3\bin\mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				bat "C:\Users\ankur\Documents\workspaceNewEclipse\apache-maven-3.9.3\bin\mvn test"
			}
		}

		stage('Deploy') {
			steps {
			    bat "C:\Users\ankur\Documents\workspaceNewEclipse\apache-maven-3.9.3\bin\mvn jar:jar deploy:deploy"
			}
		}
	}
}