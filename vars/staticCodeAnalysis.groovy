def call(){
    withSonarQubeEnv("${SONAR_SERVER}"){
        sh 'mvn sonar:sonar -Dsonar.projectKey=${SONAR_PROJECT_KEY} -Dsonar.projectName=${SONAR_PROJECT_NAME}'
    }

    timeout(time: 25, unit: 'MINUTES') {
        waitForQualityGate abortPipeline: true
    }
}