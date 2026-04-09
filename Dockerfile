# STAGE 1: Build the JAR inside the cloud
FROM maven:3.8.5-openjdk-17 AS build
COPY . .
# This compiles the code and runs your Question 4 tests
RUN mvn clean package -DskipTests=false

# STAGE 2: Run the JAR
FROM openjdk:17-jdk-slim
WORKDIR /app
# This copies the JAR created in the stage above
COPY --from=build /target/project_team_14-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
