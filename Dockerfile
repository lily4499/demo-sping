# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Maven project's .jar file into the container at /app
COPY target/demo-sping-0.0.1-SNAPSHOT.jar /app/

# Specify the command to run your application
CMD ["java", "-jar", "demo-sping-0.0.1-SNAPSHOT.jar"]

