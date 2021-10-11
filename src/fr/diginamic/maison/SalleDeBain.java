package fr.diginamic.maison;

public class SalleDeBain extends Piece {

	/**
	 * #Constructor
	 * 
	 * @param superficie
	 * @param etage
	 */
	public SalleDeBain(double superficie, int etage) {
		super(superficie, etage);
	}

	/**
	 * compare le type d'objet
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof SalleDeBain))
			return false;
		return true;
	}

}
