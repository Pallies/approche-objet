package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String args[]) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");

		List<String> liste3 = new ArrayList<String>();
		for (String c1 : liste1) {
			liste3.add(c1);
		}

		liste3.addAll(liste2);

//		ADDITION DES LISTES
		System.out.println("liste1 + liste2 = " + liste3);
	}

}
