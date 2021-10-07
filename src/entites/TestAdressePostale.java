package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale domicile_1 = new AdressePostale();
		domicile_1.numero=6;
		domicile_1.libelle= "impasse pageot";
		domicile_1.codePostal=44400;
		domicile_1.ville="Nantes";
		
		AdressePostale domicile_2 = new AdressePostale();
		domicile_2.numero=12;
		domicile_2.libelle= "boulevard pageot";
		domicile_2.codePostal=44400;
		domicile_2.ville="Nantes";
		AdressePostale domicile_3 = new AdressePostale(6, "impasse pageot", 44400, "Nantes");
		AdressePostale domicile_4 = new AdressePostale(12, "boulevard pageot", 44400, "Nantes");
	}

}
