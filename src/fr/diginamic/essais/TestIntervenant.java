package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {

		Intervenant salarie = new Salarie("Tom", "Hemming", 2500);
		Intervenant pigiste = new Pigiste("Edward", "Awast", 500, 14);
		System.out.println("pigiste : " + pigiste.getSalary());
		System.out.println("salarie : " + salarie.getSalary());

		pigiste.afficherDonnees();
		salarie.afficherDonnees();

	}

}
