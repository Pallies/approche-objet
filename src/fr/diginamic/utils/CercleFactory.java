package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

	/**
	 * Création d'un cercle
	 * @param rayon
	 * @return Cercle
	 */
	public static Cercle createCercle(double rayon) {
		return new Cercle(rayon);
	}

}
