pipeline {
    agent any
	tools{
		maven 'maven'
	}	
	options { timestamps () }
	//triggers{ cron('H/5 * * * *') }

    stages {
        stage("build") {
            steps {
                echo 'building the application...'
				sh "mvn -Dmaven.test.failure.ignore=true clean compile"
            }
        }

        stage("test") {
            steps {
                echo 'testing the application...'
				sh "mvn -Dmaven.test.failure.ignore=true test"
            }
        }
        
        stage("deploy") {
            steps{
                echo 'deploying the application...'
				sh "mvn -Dmaven.test.failure.ignore=true install"
            }
        }
    }
	post{
		always{
			echo 'this will always run'
			archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
			junit '**/target/surefire-reports/TEST-*.xml'
		}
		success{
			echo 'this will run only if successfull'
		}
		failure{
			echo 'This will run only if failed'
		}
		unstable{
			echo 'This will run only if the run was unstable'
		}
		changed{
			echo 'This will run only if the state changed'
		}
}
}

