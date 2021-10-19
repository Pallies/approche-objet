package fr.diginamic.testenumeration;

import static java.lang.Math.PI;

import java.util.Arrays;
import java.util.List;

public class TestEnumeration {

	public static void main(String[] args) {
//		Affectation des valeurs
		List<Saison> periode = Arrays.asList(Saison.values());

//		Affichage
		periode.stream().forEach(System.out::println);

		Saison ete = Saison.getSaison(2);
		Saison ete2 = null;
		Saison ete3 = null;
		Saison ete4 = Saison.valueOf("ETE");
		for (Saison s : periode) {
			if (s.getNom().equals("Eté"))
				ete2 = s;
		}
		for (Saison s : periode) {
			if (s.getOrder() == (2))
				ete3 = s;
		}
		System.out.println("search ETE : " + ete + " " + ete2 + " " + ete3 + " " + ete4);

		String libelle = "Hiver";
		System.out.println("instance : " + Saison.libelle(libelle));

		System.out.println("import static" + PI);
		System.out.println(EnumSimplifie.TROIS);
		System.out.println(EnumSimplifie.TROIS.ordinal());
	}

}
