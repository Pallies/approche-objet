package fr.diginamic.recensement.utils;

import java.util.function.Predicate;

import fr.diginamic.recensement.modeles.Ville;

public class EqualsVille implements Predicate<Ville> {

	private String ville = null;
	private int code;

	public EqualsVille(String name) {
		ville = name;
	}

	public EqualsVille(int name) {
		code = name;
	}

	@Override
	public boolean test(Ville ville) {
		if (this.ville != null)
			return this.ville.equals(ville.getNomCommune());
		return this.code == ville.getCommune();
	}

}
