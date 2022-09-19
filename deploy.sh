minikube image build -t com.fcant/company-svc:v0.0.1 -f Dockerfile-company .
minikube image build -t com.fcant/account-svc:v0.0.1 -f Dockerfile-account .

minikube image list

kubectl apply -f test/