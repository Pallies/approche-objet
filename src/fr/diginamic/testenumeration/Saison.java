package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps", 1), ETE("Eté", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String nom;
	private int order;

	private Saison(String nom, int order) {
		this.nom = nom;
		this.order = order;
	}

	public static Saison libelle(String label) {
		return Saison.valueOf(label.toUpperCase());
	}
	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Getter
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}
	/**Getter
	 * @return the Saison
	 * index de la liste
	 * pas de contrôle effectué sur n pour l'exercice
	 */
	public static Saison getSaison(int n) {
		Saison[] periode = Saison.values();
		return periode[n-1];
	}
}
