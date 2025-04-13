def call(String aws_id, String region, String ecr_repo){
    
    sh """
        docker build -t ${ecr_repo} .
        docker tag ${ecr_repo}:latest ${aws_id}.dkr.ecr.${region}.amazonaws.com/s${ecr_repo}:latest
    """

}