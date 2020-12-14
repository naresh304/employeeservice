FROM openjdk:8-jdk-alpine
EXPOSE 9010
ARG JAR_FILE=target/employeeservice.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]