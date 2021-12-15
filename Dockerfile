# Build stage
FROM maven:3.6.3-jdk-8-slim AS build
COPY holaworld/src /home/app/src
COPY holaworld/pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean test package

# Package stage
FROM openjdk:8-jdk-alpine
COPY --from=build /home/app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
