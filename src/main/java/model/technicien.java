package model;

import java.util.Date;

public class technicien {
	
	private int ID_TECHNICIEN;
	private String NOM;
	private String PRENOM;
	private String CIN;
	private String LIEU_NAISSANCE;
	private int TELEPHONE;
	private String EMAIL;
	private Date DATE_NAISSANCE;
	private String SPECIALITE;
	private String COMPETENCE;
	private boolean  DISPONIBILITE;
	
	public int getID_TECHNICIEN() {
		return ID_TECHNICIEN;
	}
	public void setID_TECHNICIEN(int iD_TECHNICIEN) {
		ID_TECHNICIEN = iD_TECHNICIEN;
	}
	public String getNOM() {
		return NOM;
	}
	public void setNOM(String nOM) {
		NOM = nOM;
	}
	public String getPRENOM() {
		return PRENOM;
	}
	public void setPRENOM(String pRENOM) {
		PRENOM = pRENOM;
	}
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String cIN) {
		CIN = cIN;
	}
	public String getLIEU_NAISSANCE() {
		return LIEU_NAISSANCE;
	}
	public void setLIEU_NAISSANCE(String lIEU_NAISSANCE) {
		LIEU_NAISSANCE = lIEU_NAISSANCE;
	}
	public int getTELEPHONE() {
		return TELEPHONE;
	}
	public void setTELEPHONE(int tELEPHONE) {
		TELEPHONE = tELEPHONE;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public Date getDATE_NAISSANCE() {
		return DATE_NAISSANCE;
	}
	public void setDATE_NAISSANCE(Date dATE_NAISSANCE) {
		DATE_NAISSANCE = dATE_NAISSANCE;
	}
	public String getSPECIALITE() {
		return SPECIALITE;
	}
	public void setSPECIALITE(String sPECIALITE) {
		SPECIALITE = sPECIALITE;
	}
	public String getCOMPETENCE() {
		return COMPETENCE;
	}
	public void setCOMPETENCE(String cOMPETENCE) {
		COMPETENCE = cOMPETENCE;
	}
	public boolean isDISPONIBILITE() {
		return DISPONIBILITE;
	}
	public void setDISPONIBILITE(boolean dISPONIBILITE) {
		DISPONIBILITE = dISPONIBILITE;
	}
	
	
	

}
