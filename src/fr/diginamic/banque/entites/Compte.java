package fr.diginamic.banque.entites;

public class Compte {

	public int numero;
	public double solde;
	
	
	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}


	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}
	
}
