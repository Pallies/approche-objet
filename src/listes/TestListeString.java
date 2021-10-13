package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestListeString {

	public static void main(String[] args) {
		String[] villes = { "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes" };
		ArrayList<String> liste = new ArrayList<>();
		Collections.addAll(liste, villes);
//		ADD VILLES
		System.out.println("villes de la liste : " + liste);

//		LENGTH VILLE
		Optional<String> villeGrande = liste.stream().reduce((v, old) -> v.length() > old.length() ? v : old);
		if (villeGrande.isPresent())
			System.out.println("VILLE Max Length : " + villeGrande.get());
//		UPPERCASE
		liste.stream().map(v->v.toUpperCase()).forEach(System.out::println);
		
//		LISTE DES VILLES SANS START N
//		List<String> listeSansStartN = liste.stream().filter(v -> !v.startsWith("N")).collect(Collectors.toList());
//		System.out.println(listeSansStartN);
		Iterator<String> villeIter = liste.iterator();
		while(villeIter.hasNext()) {
			
			if(villeIter.next().startsWith("N"))
				villeIter.remove();
		}
		liste.forEach(System.out::println);
	}
}
