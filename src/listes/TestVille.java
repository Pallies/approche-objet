package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestVille {
	private static int vHab;

	public static void main(String[] args) {
		Ville v1 = new Ville("Nice", 343_000);
		Ville v2 = new Ville("Carcassonne", 47_800);
		Ville v3 = new Ville("Narbonne", 53_400);
		Ville v4 = new Ville("Lyon", 484_000);
		Ville v5 = new Ville("Foix", 97_00);
		Ville v6 = new Ville("Pau", 77_200);
		Ville v7 = new Ville("Marseille", 850_700);
		Ville v8 = new Ville("Tarbes", 40_600);

		ArrayList<Ville> villeList = new ArrayList<>();
		Collections.addAll(villeList, v1, v2, v3, v4, v5, v6, v7, v8);
		Iterator<Ville> villeIter = villeList.iterator();
		vHab = Integer.MIN_VALUE;
		for (Ville v : villeList) {
			vHab = v.getNbHabitant() > vHab ? v.getNbHabitant() : vHab;
		}
//		AFFICHAGE VILLE + PEUPLEE
		List<String> ville = villeList.stream().filter(v -> v.getNbHabitant() == vHab).map(Ville::getNom)
				.collect(Collectors.toList());
		System.out.println("Ville ayant le plus d'habitant " + ville.get(0));

//		SUPPRESSION VILLE - PEUPLEE
		Optional<Integer> minHab = villeList.stream().map(Ville::getNbHabitant).reduce(Math::min);
		while (villeIter.hasNext()) {
			Ville v = villeIter.next();
			if (minHab.isPresent()) {
				if (v.getNbHabitant() == minHab.get())
					villeIter.remove();
			}
		}
		for (Ville v : villeList) {
			System.out.println(v);
		}
		System.out.println("\n\nModification des noms de villes");
//		MODIFIER LE NOM DES VILLES + 100_000
		List<Ville> villes = villeList.stream().filter(v -> v.getNbHabitant() != minHab.get()).map(v -> {
			if (v.getNbHabitant() > 100_000) {
				v.setNom(v.getNom().toUpperCase());
			}
			return v;
		}).collect(Collectors.toList());
		villes.forEach(System.out::println);
	}

}

class Ville {
	private String nom;
	private int nbHabitant;

	public Ville(String n, int hab) {
		nom = n;
		nbHabitant = hab;
	}
	@Override
	public String toString() {
		return "Ville nom = " + nom + ", nbHabitant = " + nbHabitant + " ";
	}
	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the nbHabitant
	 */
	public int getNbHabitant() {
		return nbHabitant;
	}

	/**
	 * Setter
	 * 
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}


}