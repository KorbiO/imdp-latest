pipeline {
	agent any
	stages {
		stage('SCM Checkout'){
        git credentialsId: 'gitPwd', url: 'https://github.com/KorbiO/imdp-latest'
    }
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