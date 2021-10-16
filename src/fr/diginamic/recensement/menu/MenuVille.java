package fr.diginamic.recensement.menu;

import java.util.Scanner;

import fr.diginamic.recensement.services.VilleService;
import fr.diginamic.recensement.view.AffichageMain;
import fr.diginamic.recensement.view.AffichageMenuVille;

/**
 * Class Menu Ville
 * 
 * @author Yvan Palliès
 *
 */
public class MenuVille extends MenuService {
	private VilleService villeService = new VilleService();
	private AffichageMain villeView = new AffichageMenuVille();

	@Override
	public void choixMenu(int key, Scanner scanner) {
		int numVille = 0;
		switch (key) {
//		- 3. Population d’une région donnée
		case 1:
			villeView.menu();
			numVille = choixFilter(scanner);
			villeService.populationTypeDonnee(numVille);
			break;

		default:
			break;
		}
	}

}
