package tri;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestVilles {

	public static void main(String[] args) {
		Ville v1 = new Ville("Nice", 343_000);
		Ville v2 = new Ville("Carcassonne", 47_800);
		Ville v3 = new Ville("Narbonne", 53_400);
		Ville v4 = new Ville("Lyon", 484_000);
		Ville v5 = new Ville("Foix", 97_00);
		Ville v6 = new Ville("Pau", 77_200);
		Ville v7 = new Ville("Marseille", 850_700);
		Ville v8 = new Ville("Tarbes", 40_600);

		List<Ville> villes = Arrays.asList(v1, v2, v3, v4, v5, v6, v7, v8);

//		list de villes triés par nom
		Collections.sort(villes);
		villes.forEach(System.out::println);

//		list de villes triés par Habitant
		Collections.sort(villes, new ComparatorHabitant());
		villes.forEach(System.out::println);

//		list de villes triés par nom
		Collections.sort(villes, new ComparatorNom());
		villes.forEach(System.out::println);
	}
}
