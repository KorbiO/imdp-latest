pipeline {
	agent any
	stages {
		stage('Compile') {
			steps {
			withMaven(maven : 'maven-3'){
				sh 'mvn clean package'
			}	
				  }
		}
		stage('Testing') {
			steps {
			withMaven(maven : 'maven-3'){
				sh 'mvn test'
			}	
				  }
		}
		
	}
}