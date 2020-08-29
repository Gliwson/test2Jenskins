FROM openjdk:8
EXPOSE 8080
ADD target/docker-sample.jar docker-sample.jar
ENTRYPOINT ["java","-jar","/docker-sample.jar"]
