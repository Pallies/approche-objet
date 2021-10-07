package utils;

public class Debit extends Operation {

	public Debit(String dateString, double montant) {
		super(dateString, montant);
	}

	@Override
	public String getType() {
		return "DEBIT";
	}

}
