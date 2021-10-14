package tri;

public class Ville implements Comparable<Ville> {

	private String nom;

	@Override
	public String toString() {
		return "Ville : " + nom + ", nbHab " + nbHab;
	}

	private int nbHab;

	public Ville(String nom, int nbHab) {
		this.nom = nom;
		this.nbHab = nbHab;
	}

	@Override
	public int compareTo(Ville ville) {
//		return this.nom.compareTo(ville.getNom());
//		return ville.getNom().compareTo(this.nom); inverse
//		return -this.nom.compareTo(ville.getNom()); inverse
		if (this.nbHab > ville.getNbHab())
			return 1;
		if (this.nbHab < ville.getNbHab())
			return -1;
		return 0;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter
	 * 
	 * @return the nbHab
	 */
	public int getNbHab() {
		return nbHab;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter
	 * 
	 * @param nbHab the nbHab to set
	 */
	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

}
