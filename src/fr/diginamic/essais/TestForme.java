package fr.diginamic.essais;

import fr.diginamic.formes.*;

public class TestForme {

	public static void main(String[] args) {

		Forme cercle = new Cercle(5);
		Forme rectangle = new Rectangle(5, 10);
		Forme carre = new Carre(9);
		AffichageForme viewFormes = new AffichageForme();
		viewFormes.view(carre);
		viewFormes.view(rectangle);
		viewFormes.view(cercle);
	}

}
