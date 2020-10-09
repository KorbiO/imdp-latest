pipeline {
	agent : any
	stages {
		stage('Compile') {
			steps {
			WithMaven(maven : 'maven-3'){
				sh 'mvn clean package'
			}	
				  }
		}
		stage('Testing') {
			steps {
			WithMaven(maven : 'maven-3'){
				sh 'mvn test'
			}	
				  }
		}
		
	}
}