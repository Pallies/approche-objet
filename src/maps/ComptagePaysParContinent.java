package maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		Pays p1 = new Pays("France", 65_000_000, "Europe");
		Pays p2 = new Pays("Allemagne", 80_000_000, "Europe");
		Pays p3 = new Pays("Belgique", 10_000_000, "Europe");
		Pays p4 = new Pays("Russie", 150_000_000, "Asie");
		Pays p5 = new Pays("Chine", 1_400_000_000, "Asie");
		Pays p6 = new Pays("Indnésie", 220_000_000, "océanie");
		Pays p7 = new Pays("Australie", 20_000_000, "océanie");
		List<Pays> pays = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		Set<String> continentSet = new HashSet<>();

		Map<String, Integer> continentCount = new HashMap<>();
		List<String> continentPays=pays.stream().map(Pays::getContinent).collect(Collectors.toList());
//		initialisation
		for(String c:continentPays) {
			if(continentCount.get(c)==null) {
				continentCount.put(c, 1);				
			}else {
				continentCount.put(c, continentCount.get(c)+1);
			}
		}
		continentCount.entrySet().forEach(System.out::println);
	}

}
