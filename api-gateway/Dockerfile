FROM eclipse-temurin:20-jre-alpine
WORKDIR /app
COPY target/*.jar api-gateway.jar
EXPOSE 8080
CMD ["java", "-jar", "api-gateway.jar"]