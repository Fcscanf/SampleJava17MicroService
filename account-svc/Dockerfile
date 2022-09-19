FROM openjdk:17

COPY ./target/account-svc-0.0.1-SNAPSHOT.jar /usr/app/

ENV TZ=Asia/Shanghai

WORKDIR /usr/app

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "account-svc-0.0.1-SNAPSHOT.jar"]