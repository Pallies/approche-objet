package fr.diginamic.jdr.affichage;

import fr.diginamic.jdr.modele.Personnage;

/**
 *  Affichage des combats
 * @author Yvan Palliès
 *
 */
public class AffichageCombat {

	static final String PV_STRING = " point de vie";
	
	private String name;// nom de la créature rencontrée
	
	
	/** #Constructor
	 * Affichage début de combat
	 * @param creature
	 */
	public AffichageCombat(Personnage creature) {
		
		name = creature.getClass().getSimpleName().toLowerCase();

		System.out.println("Vous croisez le chemin d'un " + name + "  " + creature.caption());
		System.out.println("   appuyer sur la touche ENTREE pour combattre");
	}

	/**
	 * affichage des attaques
	 * @param attHero
	 * @param attCreature
	 */
	public void startBattle(int attHero, int attCreature) {
		System.out.println("vous attaquez avec une force de : " + attHero);
		System.out.println("   la créature a une force de :" + attCreature+"\n");
	}

	/**
	 * affichage des dégats infligés à la créature
	 * @param injury
	 * @param creature
	 */
	public void damageCreature(int injury, Personnage creature) {
		int pv = creature.getPointDeVie();
		System.out.println("vous avez infligé à la créature " + injury + PV_STRING);
		if (pv > 0) {
			System.out.println("\til lui reste que " + pv + PV_STRING);
		} else {
			new Cadre(" he is dead .💥.", 10);
		}

	}

	/**
	 * affichage des dégats infligés au héro
	 * @param injury
	 * @param hero
	 */
	public void damageHero(int injury, Personnage hero) {
		int pv = hero.getPointDeVie();
		System.out.println("vous avez subi une blessure de " + Math.abs(injury) + PV_STRING);
		if (pv > 0) {
			System.out.println("\til ne vous reste que " + pv + PV_STRING);
		} else {
			new Cadre(" you're dead 💀", 10);
		}
	}

	/**
	 * affichage du nombre d'attaques
	 * @param round
	 */
	public void startRound(int round) {
		if (round != 1) {
			System.out.println(" Vous avez effectuez votre : " + round + " ème attaques\n");
		} else {
			System.out.println(" Vous avez effectuez votre : " + round + " ère attaque\n");
		}

	}

}
