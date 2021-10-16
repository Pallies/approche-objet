package fr.diginamic.recensement.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import fr.diginamic.recensement.services.DeptService;
import fr.diginamic.recensement.view.AffichageMain;
import fr.diginamic.recensement.view.AffichageMenuDept;

public class MenuDepartement extends MenuService {

	private AffichageMain deptView = new AffichageMenuDept();
	private DeptService deptService = new DeptService();

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
				deptView.msgExceptionInputInt();
				key = null;
			}
		} while (key == null);
		return key;
	}

	@Override
	public void choixMenu(int key, Scanner scanner) {
		int numDept;
		switch (key) {
//		- 2. Population d’un département donné
		case 2:
			deptView.menu();
			numDept = choixFilter(scanner);
			deptService.populationTypeDonnee(String.valueOf(numDept));
			break;
//		- 5. Afficher les 10 départements les plus peuplés
		case 5:
			deptService.dixAvecPlusPopulation();
			break;
//		- 6. Afficher les 10 villes les plus peuplées d’un département
		case 6:
			deptView.menu();
			numDept = choixFilter(scanner);
			deptService.dixVilles(String.valueOf(numDept));
			break;
//		- 8. Afficher les 10 villes les plus peuplées de France
		case 8:
			deptService.dixVillesAvecPlusPopulation();
			break;
		default:
			deptView.msgExceptionSwitch();
			break;
		}
	}

}
