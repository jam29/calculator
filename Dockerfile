# Utiliser une image Java de base
FROM openjdk:17-jdk-alpine

# Ajouter le fichier .jar généré dans l'image
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Exposer le port sur lequel l'application tourne
EXPOSE 8080

# Démarrer l'application
ENTRYPOINT ["java", "-jar", "/app.jar"]

