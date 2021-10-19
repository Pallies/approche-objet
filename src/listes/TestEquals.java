package listes;

public class TestEquals {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder();
		VilleEx v1 = new VilleEx("Nice", 343_000);
		VilleEx v2 = new VilleEx("Carcassonne", 47_800);
		VilleEx v3 = new VilleEx("Nice", 343_000);
		boolean test1 =v1.equals(v2);
		boolean test2 =v2.equals(v3);
		boolean test3 =v3.equals(v1);
		
		str.append(" test1 != test2 : ").append(test1)
			.append("\n test2 != test3 : ").append(test2)
			.append("\n test3 == test1 : ").append(test3);
		
		System.out.println(str);
	}

}

class VilleEx {
	private String nom;
	private int nbHabitant;

	public VilleEx(String n, int hab) {
		nom = n;
		nbHabitant = hab;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof VilleEx)) {
			return false;
		}
		VilleEx ville = (VilleEx) obj;
		return this.nom.equals(ville.nom) && this.nbHabitant == ville.nbHabitant;
	}

	@Override
	public String toString() {
		return "VilleEx nom = " + nom + ", nbHabitant = " + nbHabitant + " ";
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the nbHabitant
	 */
	public int getNbHabitant() {
		return nbHabitant;
	}

	/**
	 * Setter
	 * 
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
}