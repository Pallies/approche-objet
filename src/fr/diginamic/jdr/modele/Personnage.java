package fr.diginamic.jdr.modele;

import java.util.Random;

/**
 * Class abstraite de référence 
 * pour le HERO et les CREATURES
 * 
 * @author Yvan Palliès
 *
 */
public abstract class Personnage {

	private int force;
	private int pointDeVie;

	/** #Constructor
	 * construction des personnages de la force 
	 * et des point de vie
	 * en fonction des valeurs min et max
	 * @param fMin la valeur min de la force
	 * @param fMax la valeur max de la force
	 * @param pvMin la valeur min des point de vie
	 * @param pvMax la valeur max des point de vie
	 */
	protected Personnage(int fMin, int fMax, int pvMin, int pvMax) {
		force = randomNumber(fMin, fMax);
		pointDeVie = randomNumber(pvMin, pvMax);
	}

	/**
	 * affectation d'un nombre aléatoire en fonction des paramètres min et max
	 * 
	 * @param min max
	 * @return renvoie une valeur aléatoire
	 */
	private int randomNumber(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;

	}

	/**
	 * Calcul la force du personnage
	 * 
	 * @return
	 */
	public int attaque() {
		return force + randomNumber(1, 10);
	}

	/**
	 * Getter
	 * 
	 * @return the pointDeVie
	 */
	public int getPointDeVie() {
		return pointDeVie;
	}

	/**
	 * Affecte le nombre de blessure au personnage
	 * 
	 * @param nombre de dégats
	 */
	public void damage(int injury) {
		this.pointDeVie -= Math.abs(injury);
	}

	/**
	 * @see childreen
	 * @return figure du personnage
	 */
	public abstract String caption();

}
