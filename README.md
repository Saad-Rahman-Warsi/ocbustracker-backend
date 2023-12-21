In order to deploy the program in kubernetes, the following steps 
1. start kubernetes (by running minikube start etc)
2. download the entire kuberetes folder and run the shell script
3. run command "minikube service apigateway-service"
4. Note the url on which the api gateway runs on localhost.
5. You can use this url to interact with api-gateway in the backend.
6. To integrate with frontend follow instructions https://github.com/Saad-Rahman-Warsi/ocbustracker/blob/kubernetes-branch/README.md
   

ALTER

In order to deploy in docker, go to ocer foler use run 'docker-compose -f docker-compose.yaml up'. 

In both cases You need not build image because it will be pulled from dockerhub.

If you want to build your own image locally you should -

1. run mvn package for all microservices
2. IMPORTANT - You should replace image names with your own image names in dockrun.sh and then run the file.
3. In docker foler select the file a correct the image names
4. Run the compose
 
