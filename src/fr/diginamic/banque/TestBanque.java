package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	static Compte[] compteRef = new Compte[2];

	public static void main(String[] args) {
		Compte compte = new Compte(187, 217_000);
		Compte compte2 = new Compte(187, 217_000);
		CompteTaux compteTaux = new CompteTaux(67, 2_878, 10);
		CompteTaux compteTaux2 = new CompteTaux(67, 2_878, 10);
		
		compteRef[0] = compte;
		compteRef[1] = compteTaux;
		for (int i = 0; i < compteRef.length; i++) {
			System.out.println(compteRef[i]);

		}
		System.out.println("__-- comparaison --__");
		System.out.println("compte <-> compte : " + compte.equals(compte2));
		System.out.println("compte <-> compteTaux : " + compteRef[0].equals(compteRef[1]));
		System.out.println("compteTaux <-> compteTaux : " + compteTaux.equals(compteTaux2));
	}

}
