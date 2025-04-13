def call(String project, String imageTag, String hubUser){

    withCredentials([usernamePassword(
        credentialsId: "dockerhub",
        usernameVariable: "USER",
        passwordVariable: "PASS"
    )]) {
        sh "docker login -u '$USER' -p '$PASS'"
    }
    
    sh "docker image push ${hubUser}/${project}:${imageTag}"
    sh "docker image push ${hubUser}/${project}:latest"

}
