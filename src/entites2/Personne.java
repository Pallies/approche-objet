package entites2;

import entites.AdressePostale;

public class Personne {

	public AdressePostale adresse;
	public String nom;
	public String prenom;

	public Personne() {

	}
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public String getNomComplet() {
		return this.nom.toUpperCase()+" "+this.prenom;
	}

	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public AdressePostale getAdresse() {
		return adresse;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	
}
