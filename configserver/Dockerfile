FROM openjdk:8
EXPOSE 8088
ADD target/config.jar config.jar
ENTRYPOINT ["java","-jar","/config.jar"]
