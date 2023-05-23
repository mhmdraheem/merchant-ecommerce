FROM eclipse-temurin:20-jre-alpine
WORKDIR /app
COPY target/*.jar inventory-service.jar
CMD ["java", "-jar", "inventory-service.jar"]