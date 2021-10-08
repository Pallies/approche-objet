package fr.diginamic.banque;

import java.util.Objects;

import fr.diginamic.banque.entites.Compte;

public class CompteTaux extends Compte {

	int remunerationTx;

	public CompteTaux(int numero, double solde, int remunerationTx) {
		super(numero, solde);
		this.remunerationTx = remunerationTx;
	}

	@Override
	public String toString() {
		return "CompteTaux => remunerationTx = " + remunerationTx + ", "+super.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(remunerationTx);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompteTaux other = (CompteTaux) obj;
		return remunerationTx == other.remunerationTx;
	}

}
