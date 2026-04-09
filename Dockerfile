# 1. Use the specific image you mentioned
FROM eclipse-temurin:17-jdk

# 2. Set the working directory
WORKDIR /app

# 3. Copy the JAR (Double-check lowercase/uppercase to match your target folder)
COPY target/project_team_14-1.0-SNAPSHOT.jar app.jar

# 4. Command to execute the system
ENTRYPOINT ["java", "-jar", "app.jar"]