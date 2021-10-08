package fr.diginamic.essais;

import fr.diginamic.chaines.ManipulationChaine;

public class TestManipulationChaine {

	public static void main(String[] args) {
		ManipulationChaine chaine =new ManipulationChaine();
		
		
		String capital = chaine.getCapitalString();
		System.out.println("capital : "+capital);
		
		int lengthString = chaine.getLengthString();
		System.out.println("length : "+lengthString);
		
		String fullName = chaine.fullName();
		System.out.println("full Name : "+fullName);
		
		fullName = chaine.fullNameSplit("upper");
		System.out.println("full Name upper : "+fullName);
		fullName = chaine.fullNameSplit("lower");
		System.out.println("full Name lower : "+fullName);
		
		String[] tabStrings=chaine.splitMethod();
		for(String string : tabStrings) {
			System.out.println("affichage tab split : "+string);
		}
	}

}
