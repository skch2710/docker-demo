# Use an official OpenJDK runtime as a parent image
FROM openjdk:21

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the host machine to the container
COPY build/libs/docker-demo-1.0.jar /app/docker-demo-1.0.jar

# Expose port 8068 to the outside world
EXPOSE 8068

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/docker-demo-1.0.jar"]

# Optionally, set environment variables (e.g., active Spring profiles)
# ENV SPRING_PROFILES_ACTIVE=prod
