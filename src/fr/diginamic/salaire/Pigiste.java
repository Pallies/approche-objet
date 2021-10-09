package fr.diginamic.salaire;

/**
 * @author Yvan Pallies
 * 
 *         La classe Pigiste représente les personnes payées à la journée
 *
 */
public class Pigiste extends Intervenant {

	private int workingDay;// le nombre de jours travaillés pour la société durant le mois
	private double salaryDaily;// le montant journalier de rémunération
	public static final String STATUS="prestataires";
	/**
	 * #Constructor extends Intervenant
	 * 
	 * @param lastName
	 * @param name
	 */
	public Pigiste(String lastName, String name, int workingDay, double salaryDaily) {
		super(lastName, name);
		this.salaryDaily = salaryDaily;
		this.workingDay = workingDay;
	}

	@Override
	public String toString() {
		return " salary = " + getSalary();
	}

	/**
	 * salary daily the calcul by working day in the month
	 */
	@Override
	public double getSalary() {
		return workingDay * salaryDaily;
	}
	/**
	 * définition du status 
	 */
	@Override
	public String getStatus() {
		return STATUS;
	}
	/**
	 * Getter
	 * 
	 * @return the workingDay
	 */
	public int getWorkingDay() {
		return workingDay;
	}

	/**
	 * Setter
	 * 
	 * @param workingDay the workingDay to set
	 */
	public void setWorkingDay(byte workingDay) {
		this.workingDay = workingDay;
	}

	/**
	 * Getter
	 * 
	 * @return the salaryDaily
	 */
	public double getSalaryDaily() {
		return salaryDaily;
	}

	/**
	 * Setter
	 * 
	 * @param salaryDaily the salaryDaily to set
	 */
	public void setSalaryDaily(double salaryDaily) {
		this.salaryDaily = salaryDaily;
	}

}
