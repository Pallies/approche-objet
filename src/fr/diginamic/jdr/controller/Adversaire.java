package fr.diginamic.jdr.controller;

import java.util.Random;

import fr.diginamic.jdr.modele.Gobelin;
import fr.diginamic.jdr.modele.Loup;
import fr.diginamic.jdr.modele.Personnage;
import fr.diginamic.jdr.modele.Troll;

/**
 * Détermine l'adversaire rencontré
 * @author Yvan Palliès
 *
 */
public class Adversaire {

	private Personnage creature;

	public Adversaire() {
		creature = selectOpponent();
	}

	private Personnage selectOpponent() {
		Random random = new Random();
		int nb = random.nextInt(3);
		switch (nb) {
		case 0:
			return new Loup();
		case 1:
			return new Gobelin();
		case 2:
			return new Troll();
		default:
			return new Loup();
		}
	}

	/**Getter
	 * @return the adversaire
	 */
	public Personnage getCreature() {
		return creature;
	}
}
