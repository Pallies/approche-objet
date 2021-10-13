package fr.diginamic.swing.jdr.personnage;

/**
 * Class Creature implémentant
 * la méthode caption "image de la créature"
 * @author Yvan Palliès
 *
 */
public abstract class Creature extends Personne {


	public Creature(int forceMin, int forceMax, int pointVieMin, int pointVieMax) {
		super(forceMin, forceMax, pointVieMin, pointVieMax);
	}

	public abstract String caption();
}
