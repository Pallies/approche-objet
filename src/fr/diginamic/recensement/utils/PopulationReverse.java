package fr.diginamic.recensement.utils;

import java.util.Comparator;

import fr.diginamic.recensement.modeles.Ville;

public class PopulationReverse implements Comparator<Ville> {

	@Override
	public int compare(Ville v1, Ville v2) {
		return (int) (v2.getPopulation()-v1.getPopulation());
	}


}
