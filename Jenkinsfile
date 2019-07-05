pipeline {
    agent {
        docker { image 'maven:3' }
    }
    stages {
        stage('Version') {
            steps {
                sh 'mvn --version'
            }
        }
        stage('Download code') {
            steps {
                git branch: 'sonarcloudactions', url: 'https://github.com/hemanth22/GroovyLearning.git'
            }
        }
        stage('Maven compile') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('Maven test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Maven package') {
            steps {
                sh 'mvn package'
            }
        }
        stage('Maven Deployment') {
            steps {
                sh 'mvn deploy'
            }
        }
    }
}
