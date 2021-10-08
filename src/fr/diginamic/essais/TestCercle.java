package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle_1 = new Cercle(5);
		Cercle cercle_2 = new Cercle(15);
		
		System.out.println(cercle_1.toString());
		System.out.println(cercle_2.toString());
		
		Cercle cercle_3=CercleFactory.createCercle(10);
		System.out.println(cercle_3.toString());
	}
}
