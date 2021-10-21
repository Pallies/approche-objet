package fr.nutriscores.openfoodfacts.utils;

import java.util.function.Function;

import fr.nutriscores.openfoodfacts.models.Attributs;

public class AffectationBuider implements Function<Double, Attributs> {
 private static final String REGEX_CHIFFRE D ="[0-9.E,]*";
	private Attributs attribut;
	
	public AffectationBuider(Attributs attr){
		attribut=attr;
	}
	@Override
	public Attributs  apply(String value) {
		
		
		attribut.setQuantite(value);
		return attribut;
	}



}
