package fr.diginamic.entites;

import fr.diginamic.geometrique.ObjectGeometrique;

public class Cercle implements ObjectGeometrique{
	private double rayon;

	public Cercle(double r) {
		rayon = r;
	}

	/**
	 *calcul du périmètre
	 */
	@Override
	public double perimetre() {
		return 2 * rayon * Math.PI;
	}

	/**
	 *calcul de la surface
	 */
	@Override
	public double surface() {
		return rayon * rayon * Math.PI;
	}

	/**
	 *renvoie les informations {@code: perimetre()} et {@code: surface()}
	 * sous forme de chaine de caractères
	 */
	@Override
	public String toString() {
		return "Cercle [perimetre()=" + perimetre() + " m, surface()=" + surface() + " m²]";
	}
}
