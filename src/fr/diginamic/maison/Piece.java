package fr.diginamic.maison;

public abstract class Piece {

	private double superficie;
	private int etage;
	
	/** #Constructor
	 * création de la valeur absolue de superficie
	 * 
	 * @param double superficie
	 * @param int etage
	 */
	Piece(double superficie, int etage) {
		this.superficie = Math.abs(superficie);
		this.etage = etage;
	}

	@Override
	public String toString() {
		return "Piece superficie=" + superficie + ", etage=" + etage ;
	}

	/**Getter
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**Setter
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**Getter
	 * @return the etage
	 */
	public int getEtage() {
		return etage;
	}

	/**Setter
	 * @param etage the etage to set
	 */
	public void setEtage(int etage) {
		this.etage = etage;
	}
	
}
