package fr.diginamic.recensement.menu;

import java.util.Scanner;

import fr.diginamic.recensement.services.VilleService;
import fr.diginamic.recensement.view.AffichageMain;
import fr.diginamic.recensement.view.AffichageMenuVille;

public class MenuVille extends MenuService {
	private VilleService villeService=new VilleService();
	private AffichageMain villeView;


	@Override
	public void choixMenu(int key, Scanner scanner) {
		int numVille = 0;
		switch (key) {
//		- 3. Population d’une région donnée
		case 1:
			villeView = new AffichageMenuVille();
			numVille = choixFilter(scanner);
			villeService.populationTypeDonnee(numVille);
			break;

		default:
			break;
		}
	}

}
