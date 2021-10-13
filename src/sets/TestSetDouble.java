package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class TestSetDouble {

	public static void main(String[] args) {
		double[] doubleTab = { 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01 };
		Set<Double> setDouble = new HashSet<>();
		for (double d : doubleTab) {
			setDouble.add(d);
		}
//		AFFICHAGE COLLECTION
		setDouble.forEach(System.out::println);

//		GRAND CHIFFRE
		double max = Double.NaN;
		for (double d : setDouble) {
			if (max == Double.NaN)
				max = d;
			max = max > d ? max : d;
		}
		System.out.println(" Le plus grand chiffre : " + max);

//		SUPPRESSION DU PLUS - CHIFFRE
		Iterator<Double> doubleIter = setDouble.iterator();
		double min = Double.NaN;

		for (double d : setDouble) {
			if (min == Double.NaN)
				min = d;
			min = min < d ? min : d;
		}
		System.out.println(" Le plus petit chiffre : " + min);
		while (doubleIter.hasNext()) {
			if (min == doubleIter.next())
				doubleIter.remove();
		}
		
		setDouble.stream().forEach(d-> System.out.print(d+"  "));
	}

}
