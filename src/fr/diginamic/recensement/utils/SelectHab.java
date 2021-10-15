package fr.diginamic.recensement.utils;

import java.util.function.Function;

import fr.diginamic.recensement.modeles.Ville;

public class SelectHab implements Function<Ville, Long> {

	@Override
	public Long apply(Ville v) {
		return v.getPopulation();
	}

}
