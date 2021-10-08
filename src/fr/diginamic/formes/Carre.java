package fr.diginamic.formes;


public class Carre extends Rectangle {

	/** #Constructor
	 * @param length
	 */
	public Carre(double length) {
		super(length, length);
	}

	/**
	 *@see description of heritage the caculate methods
	 */
	@Override
	public String toString() {
		return "this Carre has a perimeter of " + caculatePerimeter() + " M and a area of " + calculateArea() + " M²";
	}

	
}
