FROM eclipse-temurin:20-jre-alpine
WORKDIR /app
COPY target/*.jar order-service.jar
CMD ["java", "-jar", "order-service.jar"]