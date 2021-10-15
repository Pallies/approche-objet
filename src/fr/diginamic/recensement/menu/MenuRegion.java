package fr.diginamic.recensement.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import fr.diginamic.recensement.services.RegionService;
import fr.diginamic.recensement.view.AffichageMenuRegion;

public class MenuRegion extends MenuService {

	private AffichageMenuRegion regionView= new AffichageMenuRegion();
	private RegionService regionService = new RegionService();

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
		int numReg = 0;
		switch (key) {
//		- 3. Population d’une région donnée
		case 3:
			regionView.menuRegion();
			numReg = choixFilter(scanner);
			regionService.populationTypeDonnee(String.valueOf(numReg));
			break;
//		- 4. Afficher les 10 régions les plus peuplées
		case 4:
			regionService.dixAvecPlusPopulation();
			break;
//		- 7. Afficher les 10 villes les plus peuplées d’une région
		case 7:
			regionView.menuRegion();
			numReg = choixFilter(scanner);
			regionService.dixVilles(String.valueOf(numReg));
			break;
		default:
			break;
		}
	}
}
