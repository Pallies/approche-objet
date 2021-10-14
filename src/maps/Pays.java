package maps;

public class Pays {

	private String nom;
	private int nbHab;
	private String continent;

	Pays(String nom, int nbHab, String continent) {
		this.nom = nom;
		this.nbHab = nbHab;
		this.continent = continent;
	}

	/**Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Getter
	 * @return the nbHab
	 */
	public int getNbHab() {
		return nbHab;
	}

	/**Setter
	 * @param nbHab the nbHab to set
	 */
	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

	/**Getter
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}

	/**Setter
	 * @param continent the continent to set
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}
}
