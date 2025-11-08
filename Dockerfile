# Image de base avec Tomcat et JDK
FROM tomcat:10.1-jdk17

# Copier de l'application dans le dossier webapps du conteneur Tomcat
COPY ./plateforme-signalement.war /usr/local/tomcat/webapps/

# Exposer le port 8080
EXPOSE 8080

# Lancer Tomcat automatiquement
CMD ["catalina.sh", "run"]
