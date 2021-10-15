package fr.diginamic.recensement.utils;

import java.util.function.Predicate;

import fr.diginamic.recensement.modeles.Ville;

public class FilterFrance implements Predicate<Ville> {

	@Override
	public boolean test(Ville ville) {
		return ville.getCodeDept().length()<3;
	}

}
