package fr.diginamic.recensement.utils;

import java.util.Comparator;
import java.util.Map;

public class HashComparator implements Comparator<String> {
	Map<String, Long> hashMap;

	public HashComparator(Map<String, Long> hashMap) {
		this.hashMap = hashMap;
	}

	@Override
	public int compare(String v1, String v2) {
		return (int) (hashMap.get(v2) - hashMap.get(v1));
	}

}
