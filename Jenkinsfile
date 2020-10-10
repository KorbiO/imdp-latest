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
			
				sh 'mvn -Dmaven.test.failure.ignoire=true clean package'
				
			}	
				  }
		}
		stage('Build Docker Image'){
			steps{
        		sh 'docker build -t omarkorbi/imdb:latest .'
        		}
    }
     stage('Push Docker Image'){
     	steps{
	        sh 'docker login -u omarkorbi -p gotktpas123'
	  		sh 'docker tag imdp:latest omarkorbi/imdp '
	  		sh 'docker push omarkorbi/imdp'
	  		}
    }
    stage('Run Container on Dev Server'){
    	steps{
   	   		sh 'docker run -p 8761:8761 -d --name imdp omarkorbi/imdp:latest'
   	   		}
    }
		
	}
}