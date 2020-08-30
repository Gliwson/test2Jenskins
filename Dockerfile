FROM openjdk:8
EXPOSE 8085
ADD target/docker-sample.jar docker-sample.jar
ENTRYPOINT ["java","-jar","/docker-sample.jar"]
