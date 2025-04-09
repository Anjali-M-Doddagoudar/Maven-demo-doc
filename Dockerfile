# Use a secure, lightweight base image
FROM openjdk:17.0.10-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the jar file built by Maven
COPY target/demo-1.jar app.jar

# Command to run the jar file
CMD ["java", "-jar", "app.jar"]
