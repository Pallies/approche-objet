package fr.nutriscores.openfoodfacts.models;

import java.util.HashMap;

/**
 * @author Yvan Palliès
 * référence pour 100Gr
 * de quantité d'élément 
 * pour un attribut Naturel donné
 */
public class Element {
	
	private HashMap<String, Double> element;

	public Element(Attributs attribut) {
		element.put(attribut.getNom(), attribut.getQuantite());
	}

}
