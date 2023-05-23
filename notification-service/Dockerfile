FROM eclipse-temurin:20-jre-alpine
WORKDIR /app
COPY target/*.jar notification-service.jar
CMD ["java", "-jar", "notification-service.jar"]