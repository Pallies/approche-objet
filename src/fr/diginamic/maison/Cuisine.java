package fr.diginamic.maison;

public class Cuisine extends Piece {

	/**
	 * #Constructor
	 * 
	 * @param superficie
	 * @param etage
	 */
	public Cuisine(double superficie, int etage) {
		super(superficie, etage);
	}

	/**
	 * compare le type d'objet
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Cuisine))
			return false;
		return true;
	}

}
