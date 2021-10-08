package fr.diginamic.salaire;

/**
 * @author Yvan Pallies
 * 
 * La classe Pigiste représente les personnes payées à la journée
 *
 */
public class Pigiste extends Intervenant {

	byte workingDay;// le nombre de jours travaillés pour la société durant le mois
	double salaryDaily;// le montant journalier de rémunération

	/** #Constructor 
	 * extends Intervenant
	 * @param lastName
	 * @param name
	 */
	public Pigiste(String lastName, String name) {
		super(lastName, name);
	}

	/**
	 * salary daily
	 * the calcul by working day in the month
	 */
	@Override
	public double getSalary() {
		return workingDay * salaryDaily;
	}

}
