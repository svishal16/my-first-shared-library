def call(String project, String imageTag, String hubUser){
    
    sh """
        docker rmi ${hubUser}/${project} ${hubUser}/${project}:${imageTag}
        docker rmi ${hubUser}/${project} ${hubUser}/${project}:latest
    """

}