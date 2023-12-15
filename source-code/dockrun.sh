tag="1.1.1"

cd cloud-gateway
docker build -t saadrahmanwarsi/cloudgatewayoc:$tag .
docker push saadrahmanwarsi/cloudgatewayoc:$tag
cd ..

cd service-registry
docker build -t saadrahmanwarsi/serviceregistryoc:$tag .
docker push saadrahmanwarsi/serviceregistryoc:$tag
cd ..

cd config-server
docker build -t saadrahmanwarsi/configserveroc:$tag .
docker push saadrahmanwarsi/configserveroc:$tag
cd ..

cd communicatewithoc
docker build -t saadrahmanwarsi/communicatewithoc:$tag .
docker push saadrahmanwarsi/communicatewithoc:$tag
cd ..

cd timeofbus
docker build -t saadrahmanwarsi/timeofbusoc:$tag .
docker push saadrahmanwarsi/timeofbusoc:$tag
cd ..

cd sendpost
docker build -t saadrahmanwarsi/sendpost:$tag .
docker push saadrahmanwarsi/sendpost:$tag
cd ..