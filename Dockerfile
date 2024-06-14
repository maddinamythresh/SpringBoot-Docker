FROM openjdk:23-jdk-slim

# Install netcat-openbsd using apt-get
RUN apt-get update && apt-get install -y netcat-openbsd

# Add the application JAR file
ADD target/student-management.jar student-management.jar

# Add the wait-for-it script
ADD wait-for-it.sh wait-for-it.sh
RUN chmod +x wait-for-it.sh

# Expose the port
EXPOSE 8080

# Define the entry point
ENTRYPOINT ["./wait-for-it.sh", "mysql", "3306", "--", "java", "-jar", "/student-management.jar"]
