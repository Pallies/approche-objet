package fr.diginamic.recensement.menu;

import java.util.Scanner;

import fr.diginamic.recensement.services.RegionService;
import fr.diginamic.recensement.view.AffichageMain;
import fr.diginamic.recensement.view.AffichageMenuRegion;
/**
 * Class Menu Région
 * @author Yvan Palliès
 *
 */
public class MenuRegion extends MenuService {

	private AffichageMain regionView= new AffichageMenuRegion();
	private RegionService regionService = new RegionService();


	@Override
	public void choixMenu(int key, Scanner scanner) { 
		int numReg = 0;
		switch (key) {
//		- 3. Population d’une région donnée
		case 3:
			regionView.menu();
			numReg = choixFilter(scanner);
			regionService.populationTypeDonnee(String.valueOf(numReg));
			break;
//		- 4. Afficher les 10 régions les plus peuplées
		case 4:
			regionService.dixAvecPlusPopulation();
			break;
//		- 7. Afficher les 10 villes les plus peuplées d’une région
		case 7:
			regionView.menu();
			numReg = choixFilter(scanner);
			regionService.dixVilles(String.valueOf(numReg));
			break;
		default:
			break;
		}
	}
}
