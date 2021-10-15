package fr.diginamic.recensement.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import fr.diginamic.recensement.modeles.Ville;

/**
 * Class @Singleton de référence pour le fichier en lecture recensement.csv
 * 
 * @author Yvan Palliès
 * 
 *         attribut de class List<Ville> villeList
 */
public class Recensement {
	private static final String PATH_FILE = String.valueOf(
			"C:/Users/Peac178/Documents/dev/Diginamic/Cours/6 - Java objet/J7 - autoformation/recensement.csv");

	private static List<Ville> villeList = null;

	private Recensement() {
		Path path = Paths.get(PATH_FILE);
		try {
//			LECTURE FILE
			List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
//			AFFECTATION
			setVilleList(
					lines.stream().skip(1).map(line -> line.split(";")).map(Ville::new).collect(Collectors.toList()));
		} catch (IOException e) {
			System.out.println("Erreur de lecture du fichier");
		}
	}

	/**
	 * Une seul lecture du fichier
	 * 
	 * @return List<Ville>
	 */
	public static List<Ville> getInstance() {
		if (villeList == null)
			new Recensement();
		return villeList;
	}

	/**
	 * Getter
	 * 
	 * @return the villeList
	 */
	public static List<Ville> getVilleList() {
		return villeList;
	}

	/**
	 * Setter
	 * 
	 * @param villeList the villeList to set
	 */
	public static void setVilleList(List<Ville> villeList) {
		Recensement.villeList = villeList;
	}

}
