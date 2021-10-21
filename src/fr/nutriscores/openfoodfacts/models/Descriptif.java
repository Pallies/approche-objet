package fr.nutriscores.openfoodfacts.models;

/**
 * @author Yvan Palliès
 * Nom d'une Marque / d'une Categorie
 * Nom d'un Ingrédient / d'un Allergene / d'un Additif
 */
public abstract class Descriptif {

	private String nom;

	public  Descriptif(String nom) {
		this.nom = nom;
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
	
}
