package fr.diginamic.recensement.view;

import java.util.Arrays;
import java.util.List;

public class AffichageMenu extends AffichageMain {

	private List<String> menu = Arrays.asList("                      ________________                            ",
			"                      __--  MENU  --__                            ",
			"                      __------------__                            ",
			"+----------------------------------------------------------------+",
			"| - 1. Population d’une ville donnée                             |",
			"| - 2. Population d’un département donné                         |",
			"| - 3. Population d’une région donnée                            |",
			"| - 4. Afficher les 10 régions les plus peuplées                 |",
			"| - 5. Afficher les 10 départements les plus peuplés             |",
			"| - 6. Afficher les 10 villes les plus peuplées d’un département |",
			"| - 7. Afficher les 10 villes les plus peuplées d’une région     |",
			"| - 8. Afficher les 10 villes les plus peuplées de France        |",
			"| - 9. Sortir                                                    |",
			"+----------------------------------------------------------------+");

	public AffichageMenu() {
		menu();
	}

	@Override
	public void menu() {
		menu.forEach(System.out::println);
	}

}
