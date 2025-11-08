package model;

import java.util.Date;

public class region {
	
	private String ID_REGION;
    private String NOM;
    private String CAPITALE_REGIONALE;
    private Double SUPERFICIE;
    private Integer POPULATION;
    private Date DATE_CREATION;
    
    
    public String getID_REGION() {
		return ID_REGION;
	}
	public void setID_REGION(String iD_REGION) {
		ID_REGION = iD_REGION;
	}
	public String getNOM() {
		return NOM;
	}
	public void setNOM(String nOM) {
		NOM = nOM;
	}
	public String getCAPITALE_REGIONALE() {
		return CAPITALE_REGIONALE;
	}
	public void setCAPITALE_REGIONALE(String cAPITALE_REGIONALE) {
		CAPITALE_REGIONALE = cAPITALE_REGIONALE;
	}
	public Double getSUPERFICIE() {
		return SUPERFICIE;
	}
	public void setSUPERFICIE(Double sUPERFICIE) {
		SUPERFICIE = sUPERFICIE;
	}
	public Integer getPOPULATION() {
		return POPULATION;
	}
	public void setPOPULATION(Integer pOPULATION) {
		POPULATION = pOPULATION;
	}
	public Date getDATE_CREATION() {
		return DATE_CREATION;
	}
	public void setDATE_CREATION(Date dATE_CREATION) {
		DATE_CREATION = dATE_CREATION;
	}
	
}
