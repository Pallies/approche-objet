package fr.diginamic.recensement.view;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * Class pour l'affichage des réponses Département
 * @author Yvan Palliès
 *
 */
public class AffichageMenuDept extends AffichageMain {

	private List<String> menu = Arrays.asList(
			"+----------------------------------------------------------------+",
			"| - Entrez. le N° département souhaité                           |",
			"+----------------------------------------------------------------+");

	public void menu() {
		menu.forEach(System.out::println);
	}
    @Override
    public void populationTotal(Long hab,String key) {
    	System.out.println(" Nbre d'habitant : " + hab + " pour le département : " + key);
    }
    @Override
    public void dixAvecPlusPopulation(TreeMap<String, Long> treeMap) {
    	int index = 0;
		for (Entry<String, Long> o : treeMap.entrySet()) {
			if (index > 9)
				break;
				index++;
			String str = index == 1 ? " er " : " ème ";
			System.out.println(" Le département " + o.getKey() + " est le " + index + str +"avec un nombre d'habitants : "+ o.getValue());
		}
    }
}
