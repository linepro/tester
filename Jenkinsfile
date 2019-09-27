pipeline {
	agent {
        node {
            label 'compile'
        }
	}

	options {
        skipDefaultCheckout()
		buildDiscarder logRotator(artifactDaysToKeepStr: '15', artifactNumToKeepStr: '5', daysToKeepStr: '15', numToKeepStr: '5')
		disableConcurrentBuilds()
		timestamps()
		quietPeriod 30
		skipStagesAfterUnstable()
		timeout(5)
	}

	tools {
		git 'Default'
		jdk 'JDK_8'
		maven 'Maven 3.6.0'
	}

	triggers {
		pollSCM 'H/2 * * * 1-5'
	}

    stages {
        stage('Build and Test') {
            // Ensure all the following steps run together on the same node
            
            stages {
                stage('Build') {
                    steps {
                        deleteDir()

                        checkout scm

                        withMaven(jdk: 'JDK_8', maven: 'Maven 3.6.0') {
                            sh 'mvn -B clean install'
                        }
                    }
                    post {
                        always {
                            junit allowEmptyResults: true, testResults: 'test-output/**/*'
                        }
                    }
                }

                stage('Deploy') {
                    when {
                        branch 'master'
                    }
                    steps {
                        withMaven(jdk: 'JDK_8', maven: 'Maven 3.6.0') {
                            sh 'mvn -B deploy'
                        }
                    }
                }
            }
        }
    }
    
    post {
        always {
            archiveArtifacts allowEmptyArchive: true, artifacts: '**/surefire-reports/**/*'
        }
    }
}