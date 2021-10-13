package fr.diginamic.swing.jdr.controler;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

import fr.diginamic.swing.jdr.personnage.Creature;
import fr.diginamic.swing.jdr.personnage.Gobelin;
import fr.diginamic.swing.jdr.personnage.Loup;
import fr.diginamic.swing.jdr.personnage.Personnage;
import fr.diginamic.swing.jdr.personnage.Troll;

public class Adversaire {
	private Creature creature;

	public Adversaire()  {
		try {
			creature = selectOpponent();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	/**
	 * sélection de la créature de façon aléatoire
	 * @return créature
	 * @throws NoSuchAlgorithmException
	 */
	private Creature selectOpponent()throws NoSuchAlgorithmException {
		Random random = SecureRandom.getInstanceStrong();
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

	/**
	 * Getter
	 * 
	 * @return the adversaire
	 */
	public Creature getCreature() {
		return creature;
	}
}
