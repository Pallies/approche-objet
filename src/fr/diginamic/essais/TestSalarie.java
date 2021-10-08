package fr.diginamic.essais;

import fr.diginamic.chaines.ManipulationChaine;
import fr.diginamic.entites.Salarie;


public class TestSalarie {

	public static void main(String[] args) {

		ManipulationChaine chaine=new ManipulationChaine();

		Salarie salarie =new Salarie(chaine.splitMethod());
		System.out.println(salarie.getSalary());
	}

}
