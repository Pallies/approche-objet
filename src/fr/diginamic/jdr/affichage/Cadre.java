package fr.diginamic.jdr.affichage;

/**
 * Class servant à l'affichage d'un cadre
 * pour englober un message
 * @author Yvan Palliès
 *
 */
public class Cadre {

	private static final String BORDER = "+----";

	/** #Constructor
	 * @param textContent // contenu de text dans la zone du milieu
	 * @param largeur permet de modifier la largeur du cadre
	 */
	public Cadre(String textContent, int largeur) {

		String borderString = BORDER.repeat(largeur) + "+";

		int textSize = textContent.length();
		int size = largeur * 5 + 1;

		for (int row = 0; row < 5; row++) {
			if (row == 0 || row == 4)
				System.out.println(borderString);
			if (row == 1 || row == 3)
				System.out.print("|" + " ".repeat(size - 2) + "|\n");
			if (row == 2)
				for (int col = 0; col < size;) {
					if (col == 0 || col == size - 1) {
						System.out.print("|");
						if (col == size - 1)
							System.out.print("\n");

					} else if (col == size / 2 - textSize/2) {
						System.out.print(textContent);
						col += textContent.length()-1;
					} else {
						System.out.print(" ");

					}
					col++;
				}

		}
	}

}
