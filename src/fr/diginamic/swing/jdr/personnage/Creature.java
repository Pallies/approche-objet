package fr.diginamic.swing.jdr.personnage;

public abstract class Creature extends Personnage {

	public Creature(int forceMin, int forceMax, int pointVieMin, int pointVieMax) {
		super(forceMin, forceMax, pointVieMin, pointVieMax);
	}
	public String caption() {
		return null;
	}
}
