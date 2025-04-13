def call(String aws_id, String region, String ecr_repo){
    
    sh """
        trivy image ${aws_id}.dkr.ecr.${region}.amazonaws.com/s${ecr_repo}:latest > scan.txt
        cat scan.txt
    """

}