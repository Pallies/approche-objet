package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale domicile_1 = new AdressePostale();
		domicile_1.numero = 6;
		domicile_1.libelle = "impasse pageot";
		domicile_1.codePostal = 44400;
		domicile_1.ville = "Nantes";

		Personne user_1 = new Personne();
		user_1.prenom = "yvan";
		user_1.nom = "Palliès";
		user_1.adresse = domicile_1;

		Personne user_2 = new Personne("yvan", "Palliès", new AdressePostale(12, "boulevard Pageot", 44400, "Nantes"));

		user_2.setAdresse(new AdressePostale(6, "impasse du boulevard", 85600, "Montaigu"));
	}

}
