In order to deploy the program , go to the uberetes foler run the shell script after starting kubernetes 

ALTER

In order to deploy in docker, go to ocer foler use run 'docker-compose -f docker-compose.yaml up'. 

In both cases You need not build image because it will be pulled from dockerhub.

If you want to build your own image locally you should -

1. run mvn package for all microservices
2. IMPORTANT - You should replace image names with your own image names in dockrun.sh and then run the file.
3. In docker foler select the file a correct the image names
4. Run the compose
 
