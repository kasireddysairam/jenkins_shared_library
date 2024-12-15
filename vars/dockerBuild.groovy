def call(String project,String ImageTag,String hubuser) {
sh """
sudo docker image build -t   ${hubuser}/${project} .
sudo docker image tag   ${hubuser}/${project}  ${hubuser}/${project}:${ImageTag}
sudo docker image tag   ${hubuser}/${project}  ${hubuser}/${project}:latest
"""
}

