FROM openjdk:14.0.2-jdk
EXPOSE 8080
ADD target/docker-sample.jar docker-sample.jar
ENTRYPOINT ["java","-jar","/docker-sample.jar"]
