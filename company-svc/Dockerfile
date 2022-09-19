FROM openjdk:17

COPY ./target/company-svc-0.0.1-SNAPSHOT.jar /usr/app/

ENV TZ=Asia/Shanghai

WORKDIR /usr/app

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "company-svc-0.0.1-SNAPSHOT.jar"]