package fr.diginamic.geometrique;

public class Rectangle implements ObjectGeometrique {

	private double largeur;
	private double longueur;

	/**
	 * constructer de rectangle
	 * @param largeur
	 * @param longueur
	 */
	Rectangle(double dLarg, double dLong) {
		largeur = dLarg;
		longueur = dLong;
	}

	@Override
	public double perimetre() {
		return 2*(largeur + longueur);
	}

	@Override
	public double surface() {
		return largeur * longueur;
	}

	@Override
	public String toString() {
		return "Rectangle [perimetre()=" + perimetre() + " m , surface()=" + surface() + " m² ]";
	}	
}
