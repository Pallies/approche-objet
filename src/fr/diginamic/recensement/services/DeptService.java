package fr.diginamic.recensement.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import fr.diginamic.recensement.controller.Recensement;
import fr.diginamic.recensement.modeles.Ville;
import fr.diginamic.recensement.utils.AddHabitants;
import fr.diginamic.recensement.utils.EqualsDept;
import fr.diginamic.recensement.utils.FilterFrance;
import fr.diginamic.recensement.utils.HashComparator;
import fr.diginamic.recensement.utils.MapHabToVille;
import fr.diginamic.recensement.utils.PopulationReverse;
import fr.diginamic.recensement.utils.SelectHab;
import fr.diginamic.recensement.view.AffichageMenuDept;

public class DeptService extends ActionService {

	private AffichageMenuDept deptView = new AffichageMenuDept();

//	- 2. Population d’un département donné
	public void populationTypeDonnee(String key) {
		Optional<Long> habTotal = Recensement.getInstance().stream().sorted(new PopulationReverse())
				.filter(new EqualsDept(key)).map(new SelectHab()).reduce(new AddHabitants());
		if (habTotal.isPresent())
			deptView.populationTotal(habTotal.get(),key);

	}

//	- 5. Afficher les 10 départements les plus peuplés	
	@Override
	public void dixAvecPlusPopulation() {
		Map<String, Long> deptByHab = new HashMap<String, Long>();
		for (Ville v : Recensement.getInstance()) {
			deptByHab.merge(v.getCodeDept(), v.getPopulation(), Long::sum);
		}

		TreeMap<String, Long> treeMap = new TreeMap<String, Long>(new HashComparator(deptByHab));
		treeMap.putAll(deptByHab);
		deptView.dixAvecPlusPopulation(treeMap);

	}

//	- 6. Afficher les 10 villes les plus peuplées d’un département
	@Override
	public void dixVilles(String key) {
		Recensement.getInstance().stream().sorted(new PopulationReverse()).filter(new EqualsDept(key))
				.map(new MapHabToVille(1)).limit(10).forEach(System.out::println);
	}

//	- 8. Afficher les 10 villes les plus peuplées de France
	public void dixVillesAvecPlusPopulation() {
		Recensement.getInstance().stream().sorted(new PopulationReverse()).filter(new FilterFrance())
				.map(new MapHabToVille(1)).limit(10).forEach(System.out::println);
	}

}
