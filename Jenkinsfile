pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
            awsCodeBuild projectName: 'sprint6-cr-celeste-codebuild', 
            credentialsType: 'keys', 
            region: 'us-east-1', 
            sourceControlType: 'project'


               echo 'This is the build stage.'
            }
        }

        stage('Testing') {
            steps {

               echo 'This is the test stage.'
            }
        }

        stage('E2E Testing') {
            steps {

               echo 'This is the E2E Testing stage.'
            }
        }

        stage('Deploy') {
            steps {

               echo 'This is the deploy stage.'
            }
        }
    }
}