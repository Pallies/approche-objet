package fr.diginamic.recensement.view;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class AffichageMenuRegion extends AffichageMain{

	private List<String> menu = Arrays.asList(
			"+----------------------------------------------------------------+",
			"| - Entrez. le N° de région ou la région souhaitée               |",
			"+----------------------------------------------------------------+");

	@Override
	public void menu() {
		menu.forEach(System.out::println);
	}

//	private static Map<Integer, String> region = initializeMap();
//	public static Map<Integer, String> initializeMap() {
//		Map<Integer, String> tmp = new HashMap<Integer, String>();
//		for (Ville v : Recensement.getInstance()) {
//			tmp.put(v.getCodeRegion(), v.getRegion());
//		}
//		return tmp;
//	}
	@Override
	public void affichageSelectionRegion(Map<Integer, String> region) {
		for (Integer key : region.keySet()) {
			System.out.println(" Region  : " + region.get(key) + "\t\tN° " + key);
		}
	}
	@Override
	public void populationTotal(Long hab, String region) {
		System.out.println(" Nbre d'habitant : " + hab + " pour la région : " + region);
	}
	
	@Override
	public void dixAvecPlusPopulation(TreeMap<String, Long> treeMap) {
		int index = 0;
		for (Entry<String, Long> o : treeMap.entrySet()) {
			if (index > 9)
				break;
			index++;
			String str = index == 1 ? " er " : " ème ";
			System.out.println(" La région " + o.getKey() + " est le " + index + str + "avec un nombre d'habitants : "
					+ o.getValue());
		}
	}
}
