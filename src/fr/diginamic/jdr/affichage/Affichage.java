package fr.diginamic.jdr.affichage;

import fr.diginamic.jdr.modele.Hero;

public class Affichage {
	private String[] menuContent = { "Choissisez une option : ", "1 : Combattre une créature", "2 : Afficher score",
			"4 : Sortir" };

	/**
	 * Affichage du menu
	 */
	public void menu() {
		for (String view : menuContent) {
			System.out.println(view);
		}
	}

	/**
	 * Affichage du score
	 * @param perso
	 */
	public void score(Hero perso) {
		String scoreString = String.valueOf(perso.getScore());
		new Cadre(scoreString, 5);
	}

	public void loose(Hero perso) {
     new Cadre("GAME OVER "+perso.getScore(), 7);
	}

	/**
	 * Ajout de saut de page
	 */
	public void spaceBlank() {
		String[] tour = { "", "" };
		for (String t : tour)
			System.out.println(t);
	}
}
