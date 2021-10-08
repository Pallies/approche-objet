package fr.diginamic.formes;

public class Rectangle extends Forme {

	private double length;
	private double width;

	/** #Constructor
	 * @param length
	 * @param width
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	
	@Override
	public String toString() {
		return "this Rectangle  has a perimeter of " + caculatePerimeter() + " M and a area of " + calculateArea() + " M²";
	}

	@Override
	public double caculatePerimeter() {
		return 2 * (length + width);
	}

	@Override
	public double calculateArea() {
		return length * width;
	}

	/**Getter
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**Getter
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**Setter
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**Setter
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}


}
