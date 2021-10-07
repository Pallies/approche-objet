package fr.diginamic.geometrique;

public class Cercle implements ObjectGeometrique {

	private double rayon;

	/**
	 * constructeur de cercle
	 * @param rayon
	 */
	public Cercle(double r) {
		rayon = r;
	}

	@Override
	public double perimetre() {
		return 2 * rayon * Math.PI;
	}

	@Override
	public double surface() {
		return rayon * rayon * Math.PI;
	}


	@Override
	public String toString() {
		return "Cercle [perimetre()=" + perimetre() + " m, surface()=" + surface() + " m²]";
	}

}
