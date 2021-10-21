package fr.nutriscores.openfoodfacts;

import java.util.List;

import fr.nutriscores.openfoodfacts.models.Element;
import fr.nutriscores.openfoodfacts.services.ReadFoodFact;

public class ApplicationOpenFoodFacts {

	public static void main(String[] args) {

		ReadFoodFact test = new ReadFoodFact();
		List<String> openFile = test.open();
		String[] t = null ;
//		openFile.stream().filter(c->openFile.get(10).equals(c)).map(c->c.split(" | ")).forEach(System.out::println);
		for (int i = 0; i < openFile.size(); i++) {
			if (i == 27)
				t=openFile.get(i).replaceAll("[|]", ";").split(";");
		}
	}

}
