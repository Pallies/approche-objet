package fr.diginamic.recensement.utils;

import java.util.function.Function;

import fr.diginamic.recensement.modeles.Ville;

public class MapHabToVille implements Function<Ville, String> {

	private Integer index = null;

	public MapHabToVille() {
	}

	public MapHabToVille(int index) {
		this.index = index;
	}

	@Override
	public String apply(Ville v) {
		if (index == null)
			return " Nbre d'habitant : " + v.getPopulation() + " pour la ville : " + v.getNomCommune();
		String n = index == 1 ? " ère " : " ème ";
		return (index++) + n + "ville : " + v.getNomCommune() + " avec " + v.getPopulation() + " d'habitants";
	}

}
