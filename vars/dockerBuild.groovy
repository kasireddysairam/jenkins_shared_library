def call(String project,String ImageTag,String hubuser) {
sh """
 sudo su  -sdocker image build -t   ${hubuser}/${project} .
sudo su  -s docker image tag   ${hubuser}/${project}  ${hubuser}/${project}:${ImageTag}
sudo su  -s docker image tag   ${hubuser}/${project}  ${hubuser}/${project}:latest
"""
}

