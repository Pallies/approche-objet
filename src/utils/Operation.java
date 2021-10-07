package utils;

public abstract class Operation {

	public String dateString;
	public double montant;

	
	
	public Operation(String dateString, double montant) {
		this.dateString = dateString;
		this.montant = montant;
	}
	
	public abstract String getType();
}
