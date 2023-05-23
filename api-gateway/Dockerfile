FROM eclipse-temurin:20-jre-alpine
WORKDIR /app
COPY target/*.jar api-gateway.jar
CMD ["java", "-jar", "api-gateway.jar"]