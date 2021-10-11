package fr.diginamic.maison;

public class Salon extends Piece {

	/**
	 * #Constructor
	 * 
	 * @param superficie
	 * @param etage
	 */
	public Salon(double superficie, int etage) {
		super(superficie, etage);
	}

	/**
	 * compare le type d'objet
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Salon))
			return false;
		return true;
	}

}
