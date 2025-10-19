# Plateforme de signalement et suivi des problèmes urbains

## Contexte :
Le service municipal souhaite développer un système permettant la gestion des signalements des problèmes urbains. En effet, chaque région possède plusieurs service muncipaux et chaque citoyen appartient à un service municipal précis.

## Objectif : 
Permettre aux citoyens de signaler et suivre des problèmes urbains (déchets, éclairage,routes). Ainsi qu'aux employés et administrateur de gérer ces derniers et affecter les tâches aux techniciens.

## Dépendances nécessaires :
Certaines librairies ne sont **pas incluses dans le dépôt Git** (ignorées via `.gitignore`) afin d’éviter d’alourdir le projet.  
Elles doivent être ajoutées manuellement dans le dossier :

## Front-end / Styles

Ce projet utilise **Bootstrap 5** pour le style et la mise en page responsive.

- Fichier CSS principal : `webapp/css/bootstrap.min.css`
- Fichier JS (optionnel pour les composants interactifs) : `webapp/css/bootstrap.bundle.min.js`

Comment l’inclure dans vos pages JSP ?
```
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

<script src="js/bootstrap.bundle.min.js"></script>
```

##  Librairies externes

Les bibliothèques suivantes doivent être présentes dans `webapp/WEB-INF/lib/` :

- **mysql-connector-j-8.0.13.jar**  
- **jakarta.servlet.jsp.jstl-2.0.0.jar**
- **jakarta.servlet.jsp.jstl-api-2.0.0.jar**
- **taglibs-standard-impl-1.2.5-migrated-0.0.1.jar**
- **taglibs-standard-spec-1.2.5-migrated-0.0.1.jar**

## Environnement requis

Pour exécuter ce projet correctement, vous devez utiliser :

- **Java JDK 23**  
- **Apache Tomcat 10.1**  
- **Eclipse IDE for Enterprise Java and Web Developers**  
- **MySQL Server**  
- Les librairies externes dans `webapp/WEB-INF/lib/` (voir section Dépendances)

### Déployer et exécuter le projet

1. Clic droit sur le projet → `Run As → Run on Server`
2. Sélectionner le serveur Tomcat 10.1
3. Eclipse compile et déploie automatiquement le projet
4. Accéder à l’application dans le navigateur : http://localhost:8080/plateforme-signalement


### Notes importantes

- Tomcat 10 utilise **Jakarta Servlet 5.0+**.
- Les imports doivent être `jakarta.servlet.*` et non `javax.servlet.*`.
- Si le projet ne compile pas :
- Vérifier que le **JDK correct est sélectionné** :  
 ```
 Window → Preferences → Java → Installed JREs
 Project → Properties → Java Compiler → Compiler compliance level
 ```
- Les fichiers `.jar` nécessaires doivent être présents dans `WebContent/WEB-INF/lib/` (voir section Librairies externes)

## Auteurs
Aya Taki & Hajar Braidi
