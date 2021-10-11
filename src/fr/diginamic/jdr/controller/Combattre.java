package fr.diginamic.jdr.controller;

import java.util.Scanner;

import fr.diginamic.jdr.affichage.AffichageCombat;
import fr.diginamic.jdr.modele.Hero;
import fr.diginamic.jdr.modele.Personnage;

/**
 * Menu - 1
 * gestion des combats
 * @author Yvan Palliès
 *
 */
public class Combattre {

	private int tour = 1;
	private Hero hero;
	private Personnage creature;
	private AffichageCombat viewFigth;

	public Combattre(Hero hero, Personnage creature) {
		this.creature = creature;
		this.hero = hero;

		battle();

	}

	/**
	 * tour d'un Combat sort quand un des deux combattants à sa vie à zéro
	 * 
	 * séquence les tours avec la touche entrée
	 */
	public void battle() {

		viewFigth = new AffichageCombat(creature);
		Scanner scanner = null;
		while (hero.getPointDeVie() > 0 && creature.getPointDeVie() > 0) {
			if (tour != 1)
				System.out.println("\n\nAppuyer sur ENTREE pour attaquer une nouvelle fois");
//			keyPress ENTER
			scanner = new Scanner(System.in);
			scanner.nextLine();
			
//			figth 
			combat();
			tour++;
		}
//		score du joueur incrémenté
		if (creature.getPointDeVie() < 0)
			hero.setScore();
	}

	/**
	 * Calcule la force de l'attaque des personnages
	 * 
	 * @return la différence entre les attaques
	 */
	public int injury() {
		int attHero = hero.attaque();
		int attCreature = creature.attaque();
		viewFigth.startBattle(attHero, attCreature);
		return attHero - attCreature;
	}

	/**
	 * Affecte les dégats au personnage ayant le moins d'attaque
	 */
	public void combat() {
		viewFigth.startRound(tour);
		int figth = injury();
		if (figth > 0) {
			creature.damage(figth);
			viewFigth.damageCreature(figth, creature);
		} else if (figth < 0) {
			hero.damage(figth);
			viewFigth.damageHero(figth, hero);
		}
	}
}
