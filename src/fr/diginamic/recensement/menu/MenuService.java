package fr.diginamic.recensement.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import fr.diginamic.recensement.view.AffichageMain;
import fr.diginamic.recensement.view.AffichageMenu;

/**
 * Class Abtraite 
 * @see Child Class 
 * Menu
 * MenuVille
 * MenuRegion
 * MenuDepartement
 * @author Yvan Palliès
 *
 */
public abstract class MenuService {
	
	private AffichageMain menuView;
	
	public void traiter(Scanner scanner){
		Integer key = null;
		do {
			menuView=new AffichageMenu();
			try {
				key = scanner.nextInt();
				choixMenu(key, scanner);
			} catch (InputMismatchException e) {
				menuView.msgExceptionInputInt();
			}
		} while (true);
	}

	public int choixFilter(Scanner scanner) {
		Integer key = null;
		do {
			try {
				key = scanner.nextInt();

			} catch (InputMismatchException e) {
				menuView.msgExceptionInputInt();
				key = null;
			}
		} while (key == null);
		return key;
	}
	public abstract void choixMenu(int key,Scanner scanner);
	
}
