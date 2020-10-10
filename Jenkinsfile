pipeline {
	agent any
	tools {
    maven 'maven-3'
    jdk 'java'
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
			
				bat 'mvn -Dmaven.test.failure.ignoire=true clean package'
				
			}	
				  }
		}
		stage('Build Docker Image'){
			steps{
        		bat 'docker build -t omarkorbi/imdb:latest .'
        		}
    }
		
	}
}