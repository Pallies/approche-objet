package fr.nutriscores.openfoodfacts.models;

/**
 * @author Yvan Palliès
 *
 */
public enum Attributs {
	ENERGIE("energie100g", 0d), GRAISSE("graisse100g", 0d), SUCRES("sucres100g", 0d), FIBRES("fibres100g", 0d),
	PROTEINES("proteines100g", 0d), SEL("sel100g", 0d), VIT_A("vitA100g", 0d), VIT_D("vitD100g", 0d),
	VIT_E("vitE100g", 0d), VIT_K("vitK100g", 0d), VIT_C("vitC100g", 0d), VIT_B1("vitB1100g", 0d),
	VIT_B2("vitB2100g", 0d), VIT_PP("vitPP100g", 0d), VIT_B6("vitB6100g", 0d), VIT_B9("vitB9100g", 0d),
	VIT_B12("vitB12100g", 0d), CALCIUM("calcium100g", 0d), MAGNESIUM("magnesium100g", 0d), IRON("iron100g", 0d),
	FER("fer100g", 0d), BETA_CAROTENE("betaCarotene100g", 0d), IS_HUILE_DE_PALME("presenceHuilePalme", 0d);

	private String nom;
	private Double quantite;

	private Attributs(String nom, Double quota) {
		this.nom = nom;
		quantite = quota;
	}

	/**
	 * Retour d'un Attribut par son index
	 * @param index
	 * @return Attribut
	 */
	public Attributs getIndex(int index) {
		return Attributs.values()[index - 1];
	}

//	/**
//	 * retour d'Attribut par don nom
//	 * @param name
//	 * @return Attribut
//	 */
//	public Attributs getAttribut(String name) {
//		return Attributs.valueOf(name);
//	}

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
	 * @return the quantite
	 */
	public Double getQuantite() {
		return quantite;
	}

	/**Setter
	 * @param quantite the quantite to set
	 */
	public void setQuantite(Double quantite) {
		this.quantite = quantite;
	}

}
