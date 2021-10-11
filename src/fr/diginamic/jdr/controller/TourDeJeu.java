package fr.diginamic.jdr.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import fr.diginamic.jdr.affichage.Affichage;
import fr.diginamic.jdr.modele.Hero;

public class TourDeJeu {

	private Hero personnage;
	private Affichage view = new Affichage();

	/** #Constructor
	 * Class principal qui contrôle le menu
	 * et les choix utilisateur
	 * @param perso
	 */
	public TourDeJeu(Hero perso) {
		this.personnage = perso;

	}

	public void choiceMenu() {
		Scanner scanner;
		int keyNumber;


		while (true && personnage.getPointDeVie()>0) {
			try {
//				affichage
				view.spaceBlank();
				view.menu();
				
//				choix utilisateur
				scanner = new Scanner(System.in);
				keyNumber = scanner.nextInt();				
				controller(keyNumber);
				
			} catch (InputMismatchException e) {
				System.out.println(" entrez un caractère numérique");
			}
		}
//		affichage fin
		view.loose(personnage);
	}

	public void controller(int nb) {
		switch (nb) {
		case 1:
//			combattre
			view.spaceBlank();
			System.out.println("Combattre");
			Adversaire opponent = new Adversaire();
			new Combattre(personnage, opponent.getCreature());
		case 2:
//			afficher score
			view.spaceBlank();
			System.out.println("Votre score est de : ");
			view.score(personnage);
			break;
		case 4:
//			quitter
			System.out.println("quitter");
			System.exit(0);
			break;
		default:
			System.out.println(" Entrez non valide");
			break;
		}

	}

}
