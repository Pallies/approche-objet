package fr.nutriscores.openfoodfacts.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fr.nutriscores.openfoodfacts.models.Additif;
import fr.nutriscores.openfoodfacts.models.Allergene;
import fr.nutriscores.openfoodfacts.models.Attributs;
import fr.nutriscores.openfoodfacts.models.Categorie;
import fr.nutriscores.openfoodfacts.models.Element;
import fr.nutriscores.openfoodfacts.models.Ingredient;
import fr.nutriscores.openfoodfacts.models.Marque;
import fr.nutriscores.openfoodfacts.models.Produit;
import fr.nutriscores.openfoodfacts.utils.AffectationBuider;

public class FormatFile {

	public List<Produit> Format(List<String> data) {
		List<Produit> produitsList = new ArrayList<>();
		for (String d : data) {
			List<String> dataProduit = Arrays.asList(d.replaceAll("[|]", ";").split(";"));
			produitsList.add(productBuilder(dataProduit));
		}
		return produitsList;
	}

	public Produit productBuilder(List<String> dataFormat) {
		Categorie categorie = new Categorie(dataFormat.get(0));
		Marque marque = new Marque(dataFormat.get(1));
		String nom = dataFormat.get(2);
		String nutritionGradeFr = dataFormat.get(3);
		List<Ingredient> ingredients = ingredientsBuilder(dataFormat.get(4));
		List<Element> elements = elementsBuilder(dataFormat.stream().skip(5).limit(Attributs.values().length));
		List<Allergene> allergenes = null;
		List<Additif> additifs = null;
		return new Produit(categorie, marque, nom, nutritionGradeFr, ingredients, elements, allergenes, additifs);

	}

	private List<Ingredient> ingredientsBuilder(String data) {
		return Arrays.asList(data.split(",")).stream().map(Ingredient::new).collect(Collectors.toList());
	}

	private List<Element> elementsBuilder(Stream<String> stream) {
		Attributs[]  attributs= Attributs.values();
		for(Attributs attr:attributs) {
			stream.map(new AffectationBuider(attr)).collect(Collectors.toList());
			return null;
		}
	}

	private List<Allergene> allergenesBuilder(String data) {
		return null;
	}

	private List<Additif> additifsBuilder(String data) {
		return null;
	}
}
