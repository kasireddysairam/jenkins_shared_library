def call(String project, String ImageTag, String hubUser){
    
    sh """   
      trivy image --scanners vuln${hubUser}/${project}:${ImageTag}> scan.txt
    cat scan.txt
    """ }
