package fr.diginamic.swing.jdr.personnage;

import java.util.Random;

/**
 * Class référence aux Héro et créature
 * 
 * @author Yvan Palliès
 *
 */
public abstract class Personne {

	private int force;
	private int pointDeVie;

	/**
	 * #Constructor Création d'un personnage
	 * 
	 * @param forceMin
	 * @param forceMax
	 * @param pointVieMin
	 * @param pointVieMax
	 */
	public Personne(int forceMin, int forceMax, int pointVieMin, int pointVieMax) {
		force = randomDelimiteur(forceMin, forceMax);
		pointDeVie = randomDelimiteur(pointVieMin, pointVieMax);
	}

	public int attaque() {
		return force + randomDelimiteur(1, 10);
	}

	/**
	 * Attribue un chiffre aléatoire entre les min et max
	 * 
	 * @param min
	 * @param max
	 * @return chiffre aléatoire
	 */
	private int randomDelimiteur(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
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
	 * Setter
	 * 
	 * @param pointDeVie the pointDeVie to set
	 */
	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie -= Math.abs(pointDeVie);
	}

	/**
	 * Getter
	 * 
	 * @return the force
	 */
	public int getForce() {
		return force;
	}
}
