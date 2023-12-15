kubectl delete -f apigateway-service.yaml
kubectl delete -f apigateway-deployment.yaml

kubectl delete -f communicateoc-service.yaml
kubectl delete -f communicateoc-deployment.yaml

kubectl delete -f registry-service.yaml
kubectl delete -f registry-deployment.yaml

kubectl delete -f timeofbus-service.yaml
kubectl delete -f timeofbus-deployment.yaml

kubectl delete -f sendpost-service.yaml
kubectl delete -f sendpost-deployment.yaml

kubectl apply -f apigateway-service.yaml
kubectl apply -f apigateway-deployment.yaml

kubectl apply -f communicateoc-service.yaml
kubectl apply -f communicateoc-deployment.yaml

kubectl apply -f registry-service.yaml
kubectl apply -f registry-deployment.yaml

kubectl apply -f timeofbus-service.yaml
kubectl apply -f timeofbus-deployment.yaml

kubectl apply -f sendpost-service.yaml
kubectl apply -f sendpost-deployment.yaml