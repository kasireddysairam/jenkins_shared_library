def call(String project, String ImageTag, String hubUser){
    
    sh """   
      trivy image ${hubUser}/${project}:${imageTag}> scan.txt
    cat scan.txt
    """ }
