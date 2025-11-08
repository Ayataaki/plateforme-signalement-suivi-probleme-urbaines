package model;

import java.util.Date;

public class employe {
	
	private String ID_EMPLOYEE;
    private String NOM;
    private String PRENOM;
    private String CIN;
    private String LIEU_NAISSANCE;
    private String TELEPHONE;
    private String EMAIL;
    private Date DATE_NAISSANCE;
    private Date DATE_CREATION;
    private String ID_MUNICIPAL;
	
    
    public String getID_EMPLOYEE() {
		return ID_EMPLOYEE;
	}
	public void setID_EMPLOYEE(String iD_EMPLOYEE) {
		ID_EMPLOYEE = iD_EMPLOYEE;
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
	public String getTELEPHONE() {
		return TELEPHONE;
	}
	public void setTELEPHONE(String tELEPHONE) {
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
	public Date getDATE_CREATION() {
		return DATE_CREATION;
	}
	public void setDATE_CREATION(Date dATE_CREATION) {
		DATE_CREATION = dATE_CREATION;
	}
	public String getID_MUNICIPAL() {
		return ID_MUNICIPAL;
	}
	public void setID_MUNICIPAL(String iD_MUNICIPAL) {
		ID_MUNICIPAL = iD_MUNICIPAL;
	}
    
    

}
