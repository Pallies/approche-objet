package fr.diginamic.maison;

public class Wc extends Piece {

	/**
	 * #Constructor
	 * 
	 * @param superficie
	 * @param etage
	 */
	public Wc(double superficie, int etage) {
		super(superficie, etage);
	}

	/**
	 * compare le type d'objet
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Wc))
			return false;
		return true;
	}

}
