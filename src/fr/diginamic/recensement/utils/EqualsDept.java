package fr.diginamic.recensement.utils;

import java.util.function.Predicate;

import fr.diginamic.recensement.modeles.Ville;

public class EqualsDept implements Predicate<Ville> {

	private String dept;

	public EqualsDept(String code) {
		dept = code;
	}

	@Override
	public boolean test(Ville ville) {
		return dept.equals(ville.getCodeDept());
	}

}
