package dao;

import java.io.InputStream;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
	
	private static Connection connection;
    
	
	//On met la connection dans un bloc static. 
	//En effet, ceci garantit d'avoir une seule connection, lors de chargement de la classe
    static {
    try {
        // Crée un objet Properties pour lire les paramètres de configuration
        Properties props = new Properties();

        // Charge le fichier db.properties depuis le classpath (webapp/WEB-INF/config)
        InputStream in = SingletonConnection.class.getClassLoader()
                            .getResourceAsStream("config/db.properties");
        
        // Remplit l'objet Properties avec les valeurs du fichier
        props.load(in);

        // Récupère les paramètres de connexion depuis le fichier
        String url = props.getProperty("db.url");       
        String user = props.getProperty("db.user");     
        String password = props.getProperty("db.password"); 

        // Charge le driver JDBC MySQL pour établir la connexion
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Crée la connexion à la base de données avec les paramètres récupérés
        connection = DriverManager.getConnection(url, user, password);

    } catch (Exception e) {
        e.printStackTrace();
        throw new RuntimeException("Erreur de connexion à la base de données", e);
    }
}


    public static Connection getConnection() {
        if (connection == null) {
            System.err.println("Connection est null");
            throw new RuntimeException("La connexion à la base de données a échoué !");
        }
        return connection;
    }
}
