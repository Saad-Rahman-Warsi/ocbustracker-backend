In order to deploy the program in kubernetes, the following steps 
1. start kubernetes (by running minikube start etc)
2. download the entire kuberetes folder and run the shell script
3. run command "minikube service apigateway-service"
4. Note the url on which the api gateway runs on localhost.
5. You can use this url to interact with api-gateway in the backend.
6. To integrate with frontend follow instructions https://github.com/Saad-Rahman-Warsi/ocbustracker/blob/kubernetes-branch/README.md
   



In order to deploy in docker
1. go to docker folder use run 'docker-compose -f docker-compose.yaml up'.
2. In order to integrate with front end download and execute  https://github.com/Saad-Rahman-Warsi/ocbustracker/tree/docker-local

In both cases You need not build image because it will be pulled from dockerhub.

If you want to build your own image locally you should -

1. run mvn package for all microservices
2. IMPORTANT - You should replace image names with your own image names in dockrun.sh and then run the file.
3. In docker folder select the file and correct the image names
4. Run the compose


If you want to deploy the program locally i.e. without docker and kubernetes -
1. Switch to branch named local.
2. Download the entire source-code folder.
3. In Intellij IDEA open the folders (inside source-code folder) like apigateway etc in seprate windows
4. Run them all simultaneosly
5. To integrate with frontend  https://github.com/Saad-Rahman-Warsi/ocbustracker/tree/docker-local
 
