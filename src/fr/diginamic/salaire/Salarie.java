package fr.diginamic.salaire;

/**
 * @author Yvan Pallies
 * 
 * La classe Salarie représente un salarié du journal, 
 * c'es à dire ceux qui ont un contrat de travail type CDI ou CDD
 *
 */
public class Salarie extends Intervenant {

	
	double salary;// le montant du salaire mensuel
	
	/** #Constructor
	 * @param lastName
	 * @param name
	 */
	public Salarie(String lastName, String name) {
		super(lastName, name);
	}

	/**
	 * le montant du salaire mensuel
	 */
	@Override
	public double getSalary() {
		return salary;
	}



}
