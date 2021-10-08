package fr.diginamic.salaire;

import java.util.Objects;

/**
 * @author Yvan Pallies
 * 
 *         La classe Salarie représente un salarié du journal, c'es à dire ceux
 *         qui ont un contrat de travail type CDI ou CDD
 *
 */
public class Salarie extends Intervenant {

	double salary;// le montant du salaire mensuel

	/**
	 * #Constructor
	 * 
	 * @param lastName
	 * @param name
	 */
	public Salarie(String lastName, String name, double salary) {
		super(lastName, name);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return " salary =" + salary;
	}

	/**
	 * le montant du salaire mensuel
	 */
	@Override
	public double getSalary() {
		return salary;
	}
	/**
	 * définition du status 
	 */
	@Override
	public String getStatus() {
		return "CDD / CDI";
	}

	/**
	 * Setter
	 * 
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
