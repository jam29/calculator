FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/calcul-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "app.jar"]
