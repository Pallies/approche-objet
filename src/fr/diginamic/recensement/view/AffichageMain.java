package fr.diginamic.recensement.view;

import java.util.Map;
import java.util.TreeMap;


/**
 * Class Abtraite 
 * @see Child Class 
 * Menu
 * AffichageMenu
 * AffichageMenuVille
 * AffichageMenuRegion
 * AffichageMenuDept
 * @author Yvan Palliès
 *
 */
public abstract class AffichageMain {

	public void menu() {}
	
	
	/**
	 * Affichage message d'erreur
	 * pour la Class abstraite MenuService
	 */
	public void msgExceptionInputInt() {
		System.out.println("Erreur ! Caractère non-valide ");
	}
	
	/**
	 * Affichage message d'erreur
	 * pour les Class  Menu
	 * et pour la fonction choixMenu
	 */
	public void msgExceptionSwitch() {
		System.out.println("Erreur ! Choix non-valide ");
	}

	public void affichageSelectionRegion(Map<Integer,String> region) {}
	
	public void populationTotal(Long hab,String key) {}
	
	public void dixAvecPlusPopulation(TreeMap<String, Long> treeMap) {}

}
