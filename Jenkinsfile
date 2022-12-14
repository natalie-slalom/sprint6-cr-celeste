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
                sh '''#!/bin/bash
                aws deploy create-deployment \
                    --region us-east-1 \
                    --application-name sprint6-cr-celeste-codedeploy \
                    --deployment-config-name CodeDeployDefault.OneAtATime \
                    --deployment-group-name sprint6-cr-celeste-deployment-group \
                    --description "My demo deployment" \
                    --s3-location bucket=sprint6-cr-celeste-artifact,bundleType=zip,key=sprint6-cr-celeste.zip
               echo 'This is the deploy stage.'
               '''
            }
        }
    }
}