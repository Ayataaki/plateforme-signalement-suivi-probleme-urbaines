package dao;

public class Factory {
 
	private static SignalementDAO signalementDAO;
	
	public static SignalementDAO getSignalementDAO() {
		if (signalementDAO == null) {
		signalementDAO = new SignalementImpDAO();
		}
		return signalementDAO;
	}
}
