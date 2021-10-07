package utils;

public class Credit extends Operation {

	public Credit(String dateString, double montant) {
		super(dateString, montant);
	}

	@Override
	public String getType() {
		return "CREDIT";
	}

}
