pipeline {
	agent any
	tools {
    maven 'maven-3'
  }
  
	stages {
		stage('SCM Checkout'){
			steps{
        	git credentialsId: 'gitPwd', url: 'https://github.com/KorbiO/imdp-latest'
        		}
    }
		stage('Compile') {
			steps {
			withMaven(maven : 'maven-3'){
			
				bat 'mvn clean package'
				
			}	
				  }
		}
		stage('Testing') {
			steps {
			withMaven(maven : 'maven-3'){
				
				bat 'mvn test'
				
			}	
				 }
		}
		
	}
}