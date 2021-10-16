package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManipulationFichier {
	private static final String PATH_FILE = String
			.valueOf("C:/Users/Peac178/Documents/dev/Diginamic/Cours/6 - Java objet/J5_J6 - Cours/TP/recensement.csv");
	private static final String PATH_FILE_2 = String
			.valueOf("C:/Users/Peac178/Documents/dev/Diginamic/Cours/6 - Java objet/J5_J6 - Cours/TP/recensement2.csv");
private static final String HEADER=String.valueOf("Code département;Nom de la commune;Population totale");
	private static List<VilleRef> ville = new ArrayList<>();

	public static void main(String[] args) {
		Path path = Paths.get(PATH_FILE);
		List<String> lines = null;
		try {
			lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		} catch (IOException e) {

			e.printStackTrace();
		}
		ville = lines.stream().skip(1).map(VilleRef::new).collect(Collectors.toList());
		
//		Création des lignes de String pour enregistrement
		List<String> villesPlus25000Hab=new ArrayList<>();
		villesPlus25000Hab.add(HEADER);
		villesPlus25000Hab.addAll(ville.stream().filter(v -> v.getPopulation() > 25000).map(VilleRef::toString)
				.collect(Collectors.toList()));

//		Affichage ville		
//		villesPlus25000Hab.forEach(System.out::println);

//		Sauvegarde
		try {
			confirmation(villesPlus25000Hab);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String writeFiles(List<String> list,Path ciblePath) throws IOException {
		int index = 0;
		Files.write(ciblePath, list,StandardCharsets.UTF_8);

		if (Files.exists(ciblePath)) {
			System.out.println("Enregistrement du fichier est effectué !");
			return "N";
		}
		if (index++ < 3)// 3 tentatives d'enregistrement si pas d'erreur remonté
			return "N";
		return "Y";
	}

	public static void writeForceFile(List<String> list,Path ciblePath) throws IOException {
		Files.write(ciblePath, list,StandardCharsets.UTF_8,StandardOpenOption.CREATE);
	}

	private static void confirmation(List<String> list) throws IOException {
		Path pathDestination = Paths.get(PATH_FILE_2);

		Scanner scanner = new Scanner(System.in);
		String response = "Y";

		while (response.equals("Y")) {
//		 message enregistrer le fichier
			System.out.println("Voulez-vous enregistrer le fichier ? y / n");
			response = scanner.next().toUpperCase();
			while (response.equals("Y")) {
//		if existe
				if (Files.exists(pathDestination)) {
//		message voulez vous l'écraser
					System.out.println("Le fichier existe voulez-vous l'écraser ? y / n");
					response= scanner.next().toUpperCase();
					if(response.equals("Y"))
						writeForceFile(list,pathDestination);
					response="N";
				} else {
// 		message save
					response = writeFiles(list,pathDestination);
				}
			}
		}

	}
}
