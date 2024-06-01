# Use the official Maven image to build and run the project
FROM maven:3.8.1-jdk-11

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml file and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the rest of the project files into the container
COPY src ./src

# Expose the port the app runs on
EXPOSE 8080

# Run the application
CMD ["mvn", "spring-boot:run"]
