def call(String project,String ImageTag,String hubuser) {
sh """
docker image build -t   ${hubuser}/${project} .
 docker image tag   ${hubuser}/${project}  ${hubuser}/${project}:${ImageTag}
  docker image tag   ${hubuser}/${project}  ${hubuser}/${project}:latest
"""
}

