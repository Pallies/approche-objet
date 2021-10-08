package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre theatre = new Theatre("Casse pied", 125);
		theatre.register(50, 25);
		theatre.register(50, 50);
		theatre.register(25, 75);
		theatre.register(20, 75);
		System.out.println(theatre);
	}

}
