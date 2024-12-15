def call(String project,String ImageTag,String hubuser) {
sh """
 sudo su  -c docker image build -t   ${hubuser}/${project} .
sudo su  -c docker image tag   ${hubuser}/${project}  ${hubuser}/${project}:${ImageTag}
sudo su  -c docker image tag   ${hubuser}/${project}  ${hubuser}/${project}:latest
"""
}

