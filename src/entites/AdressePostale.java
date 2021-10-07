package entites;

public class AdressePostale {

	int numero;
	String libelle;
	int codePostal;
	String ville;

	public AdressePostale() {

	}

	public AdressePostale(int numero, String libelle, int codePostal, String ville) {
		this.numero = numero;
		this.libelle = libelle;
		this.codePostal = codePostal;
		this.ville = ville;
	}

}
