# define base docker image

FROM openjdk:11
LABEL maintainer="sanjay"
ADD target/Springboot-first-app-0.0.1-SNAPSHOT.jar springboot-first-app.jar
ENTRYPOINT ["java","-jar","springboot-first-app.jar"]
