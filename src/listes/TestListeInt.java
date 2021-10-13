package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {

		int[] tab = { -1, 5, 7, 3, -2, 4, 8, 5 };
		ArrayList<Integer> liste = new ArrayList<>();

//		ELEMENT DE LA LISTE
		for (int nb : tab) {
			liste.add(nb);
			System.out.println("élément de la liste : " + nb);
		}
		liste.forEach(i -> System.out.println(i + " "));
//		TAILLE
		System.out.println("Taille : " + liste.size());

//		MAX
		int max = Integer.MIN_VALUE;
		for (int nb : liste) {
			max = nb > max ? nb : max;
		}
		System.out.println("max :" + max);
//		MIN AND REMOVE BY INDEX
//		int min = Integer.MAX_VALUE;
//		for (int nb : liste) {
//			min = nb > min ? nb : min;
//		}
//		liste.remove(Integer.valueOf(min));

		
//		MIN AND REMOVE BY INDEX
		int index = 0;
		for (int i = 0; i < liste.size(); i++) {
			index = liste.get(index) > liste.get(i) ? i : index;
		}
		System.out.println("min : " + liste.get(index));
		liste.remove(index);

//		CHIFFRES ABSOLUES
		System.out.println("Suppression du min : " + liste);
		index = 0;
		for (int nb : liste) {
			liste.set(index++, Math.abs(nb));
		}
		System.out.println(" liste chiffres absolues : " + liste);
	}

}
