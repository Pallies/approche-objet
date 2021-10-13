package fr.diginamic.swing.jdr.personnage;

/**
 * Class Hero - Singleton
 * @author Yvan Palliès
 *
 */
public class Hero extends Personnage {

	private int score;
	private static Hero hero = null;

	/** #Constructor private
	 * 
	 */
	private Hero() {
		super(12, 18, 20, 50);
		score = 0;
	}

	/**
	 * Méthode de Singleton
	 * @return Hero
	 */
	public static Hero getHero() {
		if (hero == null)
			hero = new Hero();
		return hero;
	}

	/**
	 * Getter
	 * 
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Setter
	 * 
	 * @param score the score to set
	 */
	public void setScore() {
		++this.score;
	}
}
