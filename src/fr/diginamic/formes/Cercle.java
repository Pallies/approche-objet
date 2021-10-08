package fr.diginamic.formes;

public class Cercle extends Forme {

	private double ray;

	/**
	 * #Constructor
	 * 
	 * @param ray
	 */
	public Cercle(double ray) {
		this.ray = ray;
	}

	/**
	 * @see description of the caculate methods
	 * rounded to two decimal places
	 */
	@Override
	public String toString() {
		return "this Cercle has a perimeter of " + Math.round(caculatePerimeter() * 100.0) / 100.0 + " M and a area of "
				+ Math.round(calculateArea() * 100.0) / 100.0 + " M²";
	}

	@Override
	public double caculatePerimeter() {
		return 2 * ray * Math.PI;
	}

	@Override
	public double calculateArea() {
		return ray * ray * Math.PI;
	}

	/**
	 * Getter
	 * 
	 * @return the ray
	 */
	public double getRay() {
		return ray;
	}

	/**
	 * Setter
	 * 
	 * @param ray the ray to set
	 */
	public void setRay(double ray) {
		this.ray = ray;
	}

}
