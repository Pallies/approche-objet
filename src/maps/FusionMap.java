package maps;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FusionMap {

	public static void main(String args[]) {
		// Création map1
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");

		// Création map2
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
//		création
		Map<Integer, String> map3 = new HashMap<Integer, String>();

//		Affectation
		map3.putAll(map1);
		map3.putAll(map2);

//		itération sur l'ensemble du map
		Iterator<Entry<Integer, String>> mapIter = map3.entrySet().iterator();
//		itération sur la clé
		Iterator<Integer> mapKeyIter = map3.keySet().iterator();
//		itérator sur la valeur
//		Iterator<String> mapValueIter = map3.values().iterator();

//		itération avec EntrySet
		while (mapIter.hasNext()) {
			Entry<Integer, String> m = mapIter.next();
			System.out.println("key : " + m.getKey() + " value : " + m.getValue());
		}
//		itération avec Key
		System.out.println("+-----------------------------------------+");
		while (mapKeyIter.hasNext()) {
			Integer key = mapKeyIter.next();
			System.out.println("key : " + key + " value : " + map3.get(key));
		}
		Collection<String> listColor = map3.values();
		Collections.sort(listColor.stream().collect(Collectors.toList()));
		System.out.println(listColor);
	}

}
