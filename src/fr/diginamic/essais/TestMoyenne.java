package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne testCalculMoyenne = new CalculMoyenne();
		testCalculMoyenne.addMoyenne(12);
		testCalculMoyenne.addMoyenne(45);
		double d = testCalculMoyenne.calcul();
		System.out.println(d + " add");
		for (double moy : testCalculMoyenne.getMoyenne())
			System.out.println(moy);
	}

}
