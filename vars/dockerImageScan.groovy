def call(String project, String ImageTag, String hubUser) {
   try {
       sh """
       echo "Scanning image: ${hubUser}/${project}:${ImageTag}"
       trivy image ${hubUser}/${project}:${ImageTag} > scan.txt
       echo "Scan results saved to scan.txt"
       cat scan.txt
       """
   } catch (Exception e) {
       echo "Trivy scan failed: ${e.getMessage()}"
       error("Image scan failed. Please check the logs for details.")
   }
}
