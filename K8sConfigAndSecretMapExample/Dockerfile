FROM openjdk:17-alpine
LABEL maintainer="test_user@gmail.com"
EXPOSE 8080
COPY target/K8sConfigAndSecretMapExample-0.0.1-SNAPSHOT.jar K8sConfigAndSecretMapExample-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/K8sConfigAndSecretMapExample-0.0.1-SNAPSHOT.jar"]