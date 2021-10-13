package fr.diginamic.swing.jdr.controler;

import fr.diginamic.swing.jdr.personnage.Creature;
import fr.diginamic.swing.jdr.personnage.Hero;

/**
 * Class traite le combat
 * 
 * @author Yvan Palliès
 *
 */
public class Combattre {

	private int tour = 1;
	private Hero hero;
	private Creature creature;

	/**
	 * #Constructor
	 * 
	 */
	public Combattre() {
		Adversaire adversaire = new Adversaire();
		creature = adversaire.getCreature();
		hero = Hero.getHero();
		combat();
	}

	/**
	 * tour d'un Combat sort quand un des deux combattants à sa vie à zéro
	 * 
	 * séquence les tours avec la touche entrée
	 */
	public void combat() {
		while (hero.getPointDeVie() > 0 && creature.getPointDeVie() > 0) {

			blessure();
			tour++;
		}
		if (hero.getPointDeVie() > 0)
			hero.setScore();
	}

	/**
	 * Calcule la force de l'attaque des personnages
	 * 
	 * @return la différence entre les attaques
	 */
	public int attaque() {
		int attHero = hero.attaque();
		int attCreature = creature.attaque();
		return attHero - attCreature;
	}

	/**
	 * Affecte les dégats au personnage ayant le moins d'attaque
	 */
	public void blessure() {
		int coup = attaque();
		System.out.println(coup);
		if (coup > 0) {
			creature.setPointDeVie(coup);
		} else if (coup < 0) {
			hero.setPointDeVie(coup);
		}
	}
}
