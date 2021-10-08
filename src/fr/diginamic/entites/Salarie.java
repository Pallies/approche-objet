package fr.diginamic.entites;

public class Salarie {

	private String name;
	private String firstname;
	private double salary;

	/**
	 * @Constructor
	 * @param name
	 * @param firstname
	 * @param salary
	 */
	public Salarie(String name, String firstname, String salary) {
		this.name = name;
		this.firstname = firstname;
		this.salary = trimSalary(salary);
	}
	/**
	 * @Constructor
	 * @param name
	 * @param firstname
	 * @param salary
	 */
	public Salarie(String[] item) {
		this.name = item[0];
		this.firstname = item[1];
		this.salary = trimSalary(item[2]);
	}
	/**
	 * delete space of the string
	 * @param salary
	 * @return
	 */
	public double trimSalary(String salary) {
		return Double.parseDouble(salary.replace(" ", ""));
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	
}
