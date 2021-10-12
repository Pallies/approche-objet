package fr.diginamic.jdr.run;

import fr.diginamic.jdr.controller.TourDeJeu;
import fr.diginamic.jdr.modele.Hero;


/**
 * 
 * @author Yvan Palliès 
 *
 */
public class PlayAgain {

	public static void main(String[] args) {
//		construction de l'environnement
		Hero hero = new Hero();
		TourDeJeu menu = new TourDeJeu(hero);
		
//		affichage menu et lancement du tour de jeu
		menu.choiceMenu();
	}

}
