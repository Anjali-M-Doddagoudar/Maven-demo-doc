# Use an official OpenJDK image as the base
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file into the container
COPY target/demo-1.jar app.jar

# Command to run your jar file when container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
