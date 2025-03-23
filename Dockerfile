# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file from the target directory into the container
COPY techframework/target/techframework-1.0.0-SNAPSHOT.jar demo-app.jar

# Expose the port your application will run on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "demo-app.jar"]