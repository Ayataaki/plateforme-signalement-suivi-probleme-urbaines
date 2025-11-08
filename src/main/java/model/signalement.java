package model;

import java.util.Date;

public class signalement {
	
	private String ID_SIGNALEMENT;
    private String ID_CITOYEN;
    private String DESCRIPTION;
    private String LOCALISATION;
    private Date DATE_CREATION;
    private String STATUT;
    private String PREUVE;
    private String COMMENTAIRE;
	
    
    public String getID_SIGNALEMENT() {
		return ID_SIGNALEMENT;
	}
	public void setID_SIGNALEMENT(String iD_SIGNALEMENT) {
		ID_SIGNALEMENT = iD_SIGNALEMENT;
	}
	public String getID_CITOYEN() {
		return ID_CITOYEN;
	}
	public void setID_CITOYEN(String iD_CITOYEN) {
		ID_CITOYEN = iD_CITOYEN;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	public String getLOCALISATION() {
		return LOCALISATION;
	}
	public void setLOCALISATION(String lOCALISATION) {
		LOCALISATION = lOCALISATION;
	}
	public Date getDATE_CREATION() {
		return DATE_CREATION;
	}
	public void setDATE_CREATION(Date dATE_CREATION) {
		DATE_CREATION = dATE_CREATION;
	}
	public String getSTATUT() {
		return STATUT;
	}
	public void setSTATUT(String sTATUT) {
		STATUT = sTATUT;
	}
	public String getPREUVE() {
		return PREUVE;
	}
	public void setPREUVE(String pREUVE) {
		PREUVE = pREUVE;
	}
	public String getCOMMENTAIRE() {
		return COMMENTAIRE;
	}
	public void setCOMMENTAIRE(String cOMMENTAIRE) {
		COMMENTAIRE = cOMMENTAIRE;
	}
    
    

}
