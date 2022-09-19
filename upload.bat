scp .\account-svc\Dockerfile root@172.17.130.105:/opt/app17/Dockerfile-account
scp .\company-svc\Dockerfile root@172.17.130.105:/opt/app17/Dockerfile-company

scp .\account-svc\target\account-svc-0.0.1-SNAPSHOT.jar root@172.17.130.105:/opt/app17/target/
scp .\company-svc\target\company-svc-0.0.1-SNAPSHOT.jar root@172.17.130.105:/opt/app17/target/

scp -r k8s root@172.17.130.105:/opt/app17/
