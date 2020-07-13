FROM java:8
EXPOSE 8080
ADD target/spring-boot-docker-project.jar spring-boot-docker-project.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker-project.jar"]