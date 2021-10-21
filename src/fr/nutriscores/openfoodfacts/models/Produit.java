package fr.nutriscores.openfoodfacts.models;

import java.util.List;

public class Produit {

	/** Categorie du poduit */
	private Categorie categorie;
	/** Marque du produit */
	private Marque marque;
	/** nom du produit */
	private String nom;
	/** nutri Score note de A<->F */
	private String nutritionGradeFr;
	/** ingrédients dans le produit */
	private List<Ingredient> ingredients;
	/** quantité pour chaque élement pour 100g */
	private List<Element> elements;
	/** list d'allergenes */
	private List<Allergene> allergenes;
	/** list d'additifs*/
	private List<Additif> additifs;
	
	/** #Constructor
	 * @param categorie
	 * @param marque
	 * @param nom
	 * @param nutritionGradeFr
	 * @param ingredients
	 * @param elements
	 * @param allergenes
	 * @param additifs
	 */
	public Produit(Categorie categorie, Marque marque, String nom, String nutritionGradeFr,
			List<Ingredient> ingredients, List<Element> elements, List<Allergene> allergenes, List<Additif> additifs) {
		super();
		this.categorie = categorie;
		this.marque = marque;
		this.nom = nom;
		this.nutritionGradeFr = nutritionGradeFr;
		this.ingredients = ingredients;
		this.elements = elements;
		this.allergenes = allergenes;
		this.additifs = additifs;
	}

	
	
	
	/**Getter
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}
	/**Getter
	 * @return the marque
	 */
	public Marque getMarque() {
		return marque;
	}
	/**Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**Getter
	 * @return the nutritionGradeFr
	 */
	public String getNutritionGradeFr() {
		return nutritionGradeFr;
	}
	/**Getter
	 * @return the elements
	 */
	public List<Element> getElements() {
		return elements;
	}
	/**Getter
	 * @return the ingredients
	 */
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	/**Getter
	 * @return the allergenes
	 */
	public List<Allergene> getAllergenes() {
		return allergenes;
	}
	/**Getter
	 * @return the additifs
	 */
	public List<Additif> getAdditifs() {
		return additifs;
	}



}
