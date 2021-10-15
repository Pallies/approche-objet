package fr.diginamic.recensement.utils;

import java.util.function.Predicate;

import fr.diginamic.recensement.modeles.Ville;

public class EqualsRegion implements Predicate<Ville> {

	private String dept;

	public EqualsRegion(String code) {
		dept = code;
	}

	@Override
	public boolean test(Ville ville) {
		return dept.equals(String.valueOf(ville.getCodeRegion()));
	}

}
