package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class CompteTaux extends Compte {

	int remunerationTx;

	public CompteTaux(int numero, double solde, int remunerationTx) {
		super(numero, solde);
		this.remunerationTx = remunerationTx;
	}

	@Override
	public String toString() {
		return "CompteTaux [remunerationTx=" + remunerationTx + ", numero=" + numero + ", solde=" + solde + "]";
	}

}
