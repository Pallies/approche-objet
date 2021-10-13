package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {

		String[] tabString = { "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde" };
		Set<String> setString = new HashSet<>();
//		AFFECTATION
		Collections.addAll(setString, tabString);

//		AFFICHAGE PAYS + LETTRES
		Optional<String> villeMaxLength = setString.stream().reduce((x, y) -> x.length() > y.length() ? x : y);
		villeMaxLength.ifPresent(System.out::println);

//      SUPPRESSION SANS ITERATOR MAIS CONSTITUTION D UNE AUTRE LIST
//		List<String> newList = new ArrayList<>();
//			newList.addAll(villeMaxLength.map(vMax -> setString.stream().filter(v -> !v.equals(vMax))).get()
//					.collect(Collectors.toList()));
//			newList.stream().map(x->x+" ").forEach(System.out::print);

//		SUPPRESSION AVEC ITERATOR
		Iterator<String> setStringIter = setString.iterator();
		while (setStringIter.hasNext()) {
			if (villeMaxLength.get().equals(setStringIter.next()))
				setStringIter.remove();
		}
		setString.stream().map(v -> v + " ").forEach(System.out::print);
	}

}
