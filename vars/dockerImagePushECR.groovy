def call(String aws_id, String region, String ecr_repo){
    
    sh """
        aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_id}.dkr.ecr.${region}.amazonaws.com
        docker push ${ecr_repo}:latest ${aws_id}.dkr.ecr.${region}.amazonaws.com/s${ecr_repo}:latest
    """

}