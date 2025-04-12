def call(string SONAR_SERVER, string SONAR_PROJECT_KEY){
    withSonarQubeEnv("${SONAR_SERVER}"){
        sh "mvn sonar:sonar -Dsonar.projectKey=${SONAR_PROJECT_KEY}"
    }

    timeout(time: 25, unit: 'MINUTES') {
        waitForQualityGate abortPipeline: true
    }
}