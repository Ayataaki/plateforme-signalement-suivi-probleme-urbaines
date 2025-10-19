package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
	
	private static Connection connection;
    
	private static Exception lastError; // Pour stocker l'erreur
    
	//on met la connection dans un bloc static. 
	//En effet, ceci garantit d'avoir une seule connection, lors de chargement de la classe
    static {
    	//Au début, on va charger le driver 
    	try {
			Class.forName( "com.mysql.cj.jdbc.Driver" );
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	
    	//Ouvrir la connexion
        try {
        	//Veiller à adapter l'utilisateur et le mot de passe de la base de données !!!!
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/manage_products?serverTimezone=UTC", 
                "root", 
                "taki2004"
            );
        } catch (SQLException e) {
            e.printStackTrace(); // Ceci devrait afficher l'erreur dans la console
            lastError = e;
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            System.err.println("Connection est null");
            if (lastError != null) {
                System.err.println("Erreur stockée : " + lastError.getMessage());
            }
            throw new RuntimeException("La connexion à la base de données a échoué !", lastError);
        }
        return connection;
    }
}
