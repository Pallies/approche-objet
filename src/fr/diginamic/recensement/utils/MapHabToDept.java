package fr.diginamic.recensement.utils;

import java.util.function.Function;

import fr.diginamic.recensement.modeles.Ville;

public class MapHabToDept implements Function<Ville, String> {

	private Integer index = null;

	public MapHabToDept() {
	}

	public MapHabToDept(int index) {
		this.index = index;
	}

	@Override
	public String apply(Ville v) {
		String n = index == 1 ? " ère " : " ème ";
		if (index == null)
			return " Nbre d'habitant : " + v.getPopulation() + " pour le département : " + v.getCodeDept();
		return (index++) + n + "le département : " + v.getCodeDept() + " avec " + v.getPopulation() + " d'habitants";
	}
}
