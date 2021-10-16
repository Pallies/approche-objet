package fr.diginamic.recensement.menu;

import java.util.Scanner;

import fr.diginamic.recensement.view.AffichageMain;

/**
 * Class Menu Principal
 * @author Yvan Palliès
 *
 */
public class Menu extends MenuService {
	
	private AffichageMain menuView;
	private MenuDepartement deptMenu = new MenuDepartement();
	private MenuRegion regionMenu = new MenuRegion();
	private MenuVille villeMenu = new MenuVille();


	/**
	 * Choix du menu principal
	 * redirection vers le menu :
	 * villeMenu / regionMenu / deptMenu
	 * @see AffichageMenu
	 */
	@Override
	public void choixMenu(int key, Scanner scanner) {
		switch (key) {
//		- 1. Population d’une ville donnée
		case 1:
			villeMenu.choixMenu(key, scanner);
			break;
//		- 3. Population d’une région donnée
//		- 4. Afficher les 10 régions les plus peuplées
//		- 7. Afficher les 10 villes les plus peuplées d’une région
		case 3:
		case 4:
		case 7:
			regionMenu.choixMenu(key, scanner);
			break;
//		- 2. Population d’un département donné
//		- 5. Afficher les 10 départements les plus peuplés
//		- 6. Afficher les 10 villes les plus peuplées d’un département
//		- 8. Afficher les 10 villes les plus peuplées de France
		case 2:
		case 5:
		case 6:
		case 8:
			deptMenu.choixMenu(key, scanner);
			break;
//		- 9. Sortir
		case 9:
			System.exit(0);
		default:
			menuView.msgExceptionSwitch();
			break;
		}
	}

}
