# STAGE 1: Build the JAR using Maven
FROM maven:3.8.5-openjdk-17 AS build
COPY . .
# Runs the build and tests (Question 4)
RUN mvn clean package -DskipTests=false

# STAGE 2: Run the JAR using a stable Java 17 image
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
# Copy the JAR from the build stage
COPY --from=build /target/project_team_14-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
