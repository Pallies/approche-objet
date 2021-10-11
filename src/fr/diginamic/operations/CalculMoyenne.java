package fr.diginamic.operations;

public class CalculMoyenne {
	private double[] moyenne = new double[0];

	/**
	 * Ajoute une moyenne au tableau
	 * 
	 * @param moyenne
	 */
	public void addMoyenne(double moy) {
		int last = moyenne.length;
		double[] tmp = new double[last + 1];
		for (int i = 0; i < last; i++) {
			tmp[i] = moyenne[i];
		}
		tmp[last] = moy;
		moyenne = tmp;
	}

	/**
	 * additionne la somme des moyennes
	 * @return
	 */
	public double calcul() {
		double add = 0;
		for (double moy : moyenne) {
			add += moy;
		}
		return add/moyenne.length;
	}

	/**
	 * 
	 * @return the moyenne[]
	 */
	public double[] getMoyenne() {
		return moyenne;
	}

}
