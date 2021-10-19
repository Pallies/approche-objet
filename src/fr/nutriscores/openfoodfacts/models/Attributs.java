package fr.nutriscores.openfoodfacts.models;

public enum Attributs {
	ENERGIE("energie100g"),
	GRAISSE("graisse100g"),
	SUCRES("sucres100g"),
	FIBRES("fibres100g"),
	PROTEINES("proteines100g"),
	SEL("sel100g"),
	VIT_A("vitA100g"),
	VIT_D("vitD100g"),
	VIT_E("vitE100g"),
	VIT_K("vitK100g"),
	VIT_C("vitC100g"),
	VIT_B1("vitB1100g"),
	VIT_B2("vitB2100g"),
	VIT_PP("vitPP100g"),
	VIT_B6("vitB6100g"),
	VIT_B9("vitB9100g"),
	VIT_B12("vitB12100g"),
	CALCIUM("calcium100g"),
	MAGNESIUM("magnesium100g"),
	IRON("iron100g"),
	FER("fer100g"),
	BETA_CAROTENE("betaCarotene100g"),
	IS_HUILE_DE_PALME("presenceHuilePalme");
	
	private String nomAttribut;
	
	private Attributs(String nom) {
	nomAttribut=nom;	
	}

	/**Getter
	 * @return the nomAttribut
	 */
	public String getNomAttribut() {
		return nomAttribut;
	}
	
}
