package fr.diginamic.banque.entites;

import java.util.Objects;

/**
 * classe crée par
 * @author Yvan Pallies
 *
 */
public class Compte {

	private int numero;
	private double solde;
	
	
	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}


	@Override
	public String toString() {
		return "numero = " + numero + ", solde = " + solde ;
	}


	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}


	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}


	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}


	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}


	@Override
	public int hashCode() {
		return Objects.hash(numero, solde);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		return numero == other.numero && Double.doubleToLongBits(solde) == Double.doubleToLongBits(other.solde);
	}



	
}
