package fr.diginamic.recensement.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import fr.diginamic.recensement.services.VilleService;
import fr.diginamic.recensement.view.AffichageMenuVille;

public class MenuVille extends MenuService {
	private VilleService villeService=new VilleService();
	private AffichageMenuVille villeView;
	@Override
	public void traiter(Scanner scanner) {
	}

	@Override
	public int choixFilter(Scanner scanner) {
		Integer key = null;
		do {
			try {
				key = scanner.nextInt();
			} catch (InputMismatchException e) {
				key = null;
			}
		} while (key == null);
		return key;
	}

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
