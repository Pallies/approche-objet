package fr.diginamic.recensement.view;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
/**
 * Class pour l'affichage des réponses Villes
 * @author Yvan Palliès
 *
 */
public class AffichageMenuVille extends AffichageMain{

	private List<String> menu = Arrays.asList(
			"+----------------------------------------------------------------+",
			"| - Entrez. le N° de Ville souhaitée                             |",
			"+----------------------------------------------------------------+");

	@Override
	public void menu() {
		menu.forEach(System.out::println);
	}
	
	@Override
	public void affichageSelectionRegion(Map<Integer,String> region) {
		for(Integer key:region.keySet()) {
			System.out.println(" Region  : "+region.get(key)+"\t\tN° "+key);
		}
	}
}
