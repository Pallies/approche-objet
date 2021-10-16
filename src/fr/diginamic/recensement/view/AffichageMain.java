package fr.diginamic.recensement.view;

import java.util.Map;
import java.util.TreeMap;

public abstract class AffichageMain {

	public void menu() {}
	public void msgExceptionInputInt() {
		System.out.println("Erreur ! Caractère non-valide ");
	}
	public void msgExceptionSwitch() {
		System.out.println("Erreur ! Choix non-valide ");
	}

	public void affichageSelectionRegion(Map<Integer,String> region) {}
	public void populationTotal(Long hab,String key) {}
	public void dixAvecPlusPopulation(TreeMap<String, Long> treeMap) {}

}
