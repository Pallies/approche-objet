package fr.diginamic.salaire;

/**
 * @author Yvan Palliès
 * 
 * la classe Intervenant des diverses personnes travaillant pour le journal
 * regroupant :
 * La classe Salarie
 * La classe Pigiste
 */
public abstract class Intervenant {

	private String lastName;
	private String name;

	/** #Constructor
	 * @param lastName
	 * @param name
	 */
	public Intervenant(String lastName, String name) {
		super();
		this.lastName = lastName;
		this.name = name;
	}
	
	/**
	 * affichage du 
	 * nom 
	 * prenom
	 * salaire
	 * status
	 */
	public void afficherDonnees() {
		System.out.println(" lastName = " + lastName + ", name = " + name+" salary "+getSalary()+" status : "+getStatus());
	}

	/**
	 * @see in the children
	 */
	public abstract double getSalary();
	/**
	 * @see in the children
	 */
	public abstract String getStatus();
	/**
	 * Getter
	 * 
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Getter
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter
	 * 
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Setter
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
