pipeline {
    environment {

        PATH = "C:\\WINDOWS\\SYSTEM32"

    }

    agent {label 'remote1'}

    tools {
        maven 'maven'

    }
    options { timestamps () }

    //triggers{ cron('H/5 * * * *') }

    stages {
        stage("build") {
            steps {
                bat "mvn -Dmaven.test.failure.ignore=true clean compile"
            }
        }

        stage("test") {
            steps {
                echo 'testing the application...'
                bat "mvn -Dmaven.test.failure.ignore=true test"
            }
        }

        stage("deploy") {
            steps {
                echo 'deploying the application...'
                bat "mvn -Dmaven.test.failure.ignore=true test"
            }
        }
    }

    post {
        always {
            echo 'This will always run'
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            junit '**/target/surefire-reports/TEST-*.xml'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
            /*     mail to: 'sheetususheel88@gmail.com',
                     subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                     body: "Something is wrong with ${env.BUILD_URL}"*/
        }
        unstable {
            echo 'This will run only if the run was unstable'
        }
        changed {
            echo 'This will run only if the state of the pipeline has changed'
        }
    }
}