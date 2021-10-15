package fr.diginamic.recensement.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import fr.diginamic.recensement.controller.Recensement;
import fr.diginamic.recensement.modeles.Ville;
import fr.diginamic.recensement.utils.AddHabitants;
import fr.diginamic.recensement.utils.EqualsRegion;
import fr.diginamic.recensement.utils.HashComparator;
import fr.diginamic.recensement.utils.MapHabToVille;
import fr.diginamic.recensement.utils.PopulationReverse;
import fr.diginamic.recensement.utils.SelectHab;
import fr.diginamic.recensement.view.AffichageMenuRegion;

public class RegionService extends ActionService{

	private AffichageMenuRegion regionView=new AffichageMenuRegion();


//	- 3. Population d’une région donnée
	public void populationTypeDonnee(String key) {
		Optional<Long> habTotal = Recensement.getInstance().stream()
				.sorted(new PopulationReverse())
				.filter(new EqualsRegion(key))
				.map(new SelectHab())
				.reduce(new AddHabitants());
		if (habTotal.isPresent())
			regionView.populationTotal(habTotal.get(), key);
	}

//	- 4. Afficher les 10 régions les plus peuplées
	@Override
	public void dixAvecPlusPopulation() {
		Map<String, Long> regionByHab = new HashMap<String, Long>();
		for (Ville v : Recensement.getInstance()) {
			regionByHab.merge(v.getRegion(), v.getPopulation(), Long::sum);
		}
		TreeMap<String, Long> treeMap = new TreeMap<String, Long>(new HashComparator(regionByHab));
		treeMap.putAll(regionByHab);
		regionView.dixRegionAvecPlusPopulation(treeMap);
	}
//	- 7. Afficher les 10 villes les plus peuplées d’une région

	@Override
	public void dixVilles(String key) {
		Recensement.getInstance().stream()
		.sorted(new PopulationReverse())
		.filter(new EqualsRegion(key))
		.limit(10)
		.map(new MapHabToVille(1))
		.forEach(System.out::println);
	}
}
