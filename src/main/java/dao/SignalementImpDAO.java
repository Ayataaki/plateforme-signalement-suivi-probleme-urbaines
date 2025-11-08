package dao;
import model.signalement;
import java.sql.*;


public class SignalementImpDAO implements SignalementDAO {

	private Connection connection ;
	
	public SignalementImpDAO() {
		connection = SingletonConnection.getConnection();
	}
	
	@Override
	public void ajouterSignalement(signalement s) {
		
			try {
			String sql = "INSERT INTO signalement (id_citoyen, description, localisation, date_creation, statut, preuve, commentaire) VALUES (?, ?, ?, NOW(), ?, ?, ?) " ;
		    //crée un objet PreparedStatement à partir de ta requête SQL (celle avec les ?).
			PreparedStatement ps = connection.prepareStatement(sql); 
			ps.setString(1, s.getID_CITOYEN());
            ps.setString(2, s.getDESCRIPTION());
            ps.setString(3, s.getLOCALISATION());
            ps.setString(4, "Nouveau");
            ps.setString(5, s.getPREUVE());
            ps.setString(6, s.getCOMMENTAIRE());
            ps.executeUpdate();
            ps.close();
            System.out.println("Signalement ajouté avec succès !");
		
		  }catch (SQLException e){
			  e.printStackTrace();
			  
		  }
		}
}
