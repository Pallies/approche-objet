package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;


public class TestBanque {

	static Compte[] compteRef = new Compte[2];
	

	public static void main(String[] args) {
		Compte compte = new Compte(187, 217_000);
		CompteTaux compteTaux = new CompteTaux(67, 2_878, 10);
//		System.out.println(compte);

		compteRef[0] = compte;
		compteRef[1] = compteTaux;
		for (int i = 0; i < compteRef.length; i++) {
			System.out.println(compteRef[i]);
			
		}
	}

}
