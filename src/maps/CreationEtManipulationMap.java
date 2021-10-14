package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CreationEtManipulationMap {
	public static void main(String[] args) {
		Map<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

//		Ajout des villes
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
//		affichage value
		for (String n : mapVilles.values()) {
			System.out.println("\tville : " + n);
		}
//		affichage key
		for (Integer i : mapVilles.keySet()) {
			System.out.println("\t Dept : " + i);
		}
//		affichage de la key and value
		for (Entry<Integer, String> m : mapVilles.entrySet()) {
			System.out.println("ville : " + m.getValue() + "\t\t Dept : " + m.getKey());
		}
		System.out.println("Taille du HashMap : "+mapVilles.size());
	}
}
