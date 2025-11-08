package model;

import java.util.Date;

public class municipal {
	
	private String ID_MUNICIPAL;
    private String NOM;
    private String TYPE_MUNICIPAL;
    private String ID_REGION;
    private Date DATE_CREATION;
	public String getID_MUNICIPAL() {
		return ID_MUNICIPAL;
	}
	public void setID_MUNICIPAL(String iD_MUNICIPAL) {
		ID_MUNICIPAL = iD_MUNICIPAL;
	}
	public String getNOM() {
		return NOM;
	}
	public void setNOM(String nOM) {
		NOM = nOM;
	}
	public String getTYPE_MUNICIPAL() {
		return TYPE_MUNICIPAL;
	}
	public void setTYPE_MUNICIPAL(String tYPE_MUNICIPAL) {
		TYPE_MUNICIPAL = tYPE_MUNICIPAL;
	}
	public String getID_REGION() {
		return ID_REGION;
	}
	public void setID_REGION(String iD_REGION) {
		ID_REGION = iD_REGION;
	}
	public Date getDATE_CREATION() {
		return DATE_CREATION;
	}
	public void setDATE_CREATION(Date dATE_CREATION) {
		DATE_CREATION = dATE_CREATION;
	}
    
    

}
