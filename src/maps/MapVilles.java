package maps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import tri.Ville;

public class MapVilles {

	public static void main(String[] args) {
		Map<String, Ville> mapVille = new HashMap<>();
		Ville v1 = new Ville("Nice", 343_000);
		Ville v2 = new Ville("Carcassonne", 47_800);
		Ville v3 = new Ville("Narbonne", 53_400);
		Ville v4 = new Ville("Lyon", 484_000);
		Ville v5 = new Ville("Foix", 97_00);
		Ville v6 = new Ville("Pau", 77_200);
		Ville v7 = new Ville("Marseille", 850_700);
		Ville v8 = new Ville("Tarbes", 40_600);

		List<Ville> villes = Arrays.asList(v1, v2, v3, v4, v5, v6, v7, v8);
		for(Ville v:villes) {
			mapVille.put(v.getNom(),v);
		}
//		Iterator<String> iteVille = mapVille.keySet().iterator();
//		while(iteVille.hasNext()) {
//			
//		}
		Optional<Ville> minHabVille = mapVille.values().stream().min(Comparator.comparing(Ville::getNbHab));
		if(minHabVille.isPresent())
			mapVille.remove(minHabVille.get().getNom());
		
		mapVille.values().forEach(System.out::println);
	}

}
