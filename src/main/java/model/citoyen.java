package model;

import java.util.Date;

public class citoyen {
	private int ID_CITOYEN;
	private String NOM	;
	private String PRENOM ;
	private int CIN ;
	private String LIEU_NAISSANCE ;
	private int TELEPHONE ;
	private String EMAIL ;	
	private Date DATE_NAISSANCE ;
	private int ID_REGION ;
	
	
	public int getID_CITOYEN() {
		return ID_CITOYEN;
	}
	public void setID_CITOYEN(int iD_CITOYEN) {
		ID_CITOYEN = iD_CITOYEN;
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
	public int getCIN() {
		return CIN;
	}
	public void setCIN(int cIN) {
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
	public int getID_REGION() {
		return ID_REGION;
	}
	public void setID_REGION(int iD_REGION) {
		ID_REGION = iD_REGION;
	}	

}
