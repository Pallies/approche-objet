package fr.diginamic.testenumeration;

public class Ville implements Comparable<Ville> {

	private String nom;
	private int nbHab;
	private Continent continent;

	public Ville(String nom, int nbHab, Continent continent) {
		this.nom = nom;
		this.nbHab = nbHab;
		this.continent = continent;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Ville : ")
		.append(nom)
		.append(" avec un nb Habitants ")
		.append(nbHab)
		.append(" sur le continent : ")
		.append(continent.getContinent());
		return String.valueOf(str); 
	}

	@Override
	public int compareTo(Ville ville) {
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

	/**
	 * Getter
	 * 
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/**
	 * Setter
	 * 
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
