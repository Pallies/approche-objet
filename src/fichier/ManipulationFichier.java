package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManipulationFichier {
	private static final String PATH_FILE = String
			.valueOf("C:/Users/Peac178/Documents/dev/Diginamic/Cours/6 - Java objet/J5_J6 - Cours/TP/recensement.csv");
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

		List<VilleRef> villesPlus25000Hab = ville.stream().filter(v -> v.getPopulation() > 25000)
				.collect(Collectors.toList());
		villesPlus25000Hab.forEach(System.out::println);
	}

}
