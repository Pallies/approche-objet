package fr.nutriscores.openfoodfacts.services;

import java.util.List;
import java.util.stream.Collectors;

import fr.nutriscores.openfoodfacts.models.Produit;

/**
 * @author Yvan Palliès
 * @Singleton Class instanciée une seul fois pour la lecture du fichier
 *            OpenFoodFact
 * 
 *            la classe ne peut pas être instancié
 */
public class ListFoodFact {

	private List<Produit> lines = null;

	/**
	 * #Constructor 
	 * appel du Lecteur du fichier
	 * appel du formatteur de données
	 * constitution de la liste Produit
	 */
	private ListFoodFact() {
		ReadFoodFact readFile = new ReadFoodFact();
		FormatFile fileFormat = new FormatFile();
		List<String> linesFile = readFile.open();
		lines = fileFormat.Format(linesFile);
	}

	/**
	 * Restitution de la lecture du fichier
	 * 
	 * @return List (renvoie une image de Lines)
	 */
	public List<Produit> toList() {
		if (lines == null)
			new ListFoodFact();
		return lines.stream().collect(Collectors.toList());
	}
}
