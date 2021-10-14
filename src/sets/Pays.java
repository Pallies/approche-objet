package sets;

public class Pays {

	private String nom;
	private long nbHabitant;
	private double pib;

	/** #Constructor
	 * @param nom String
	 * @param nbHabitant long
	 * @param pib double
	 */
	public Pays(String nom, long nbHabitant, double pib) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pib = pib;
	}

	@Override
	public String toString() {
		return "Pays = " + nom + ", Habitants = " + nbHabitant + ", PIB = " + pib ;
	}

	/**Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Setter
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(long nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	/**Setter
	 * @param pib the pib to set
	 */
	public void setPib(double pib) {
		this.pib = pib;
	}

	/**Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Getter
	 * @return the nbHabitant
	 */
	public long getNbHabitant() {
		return nbHabitant;
	}

	/**Getter
	 * @return the pib
	 */
	public double getPib() {
		return pib;
	}
	
}
