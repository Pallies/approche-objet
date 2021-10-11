package fr.diginamic.maison;

public class Chambre extends Piece {

	/** #Constructor
	 * @param superficie
	 * @param etage
	 */
	public Chambre(double superficie, int etage) {
		super(superficie, etage);
	}

	/**
	 * compare le type d'objet
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Chambre))
			return false;
		return true;
	}

}
