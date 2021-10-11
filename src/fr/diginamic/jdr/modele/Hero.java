package fr.diginamic.jdr.modele;

public class Hero extends Personnage {

	private static final String HERO = "👳";
	private int score;

	/** #Constructor
	 * 
	 */
	public Hero() {
		super(12, 18, 20, 50);
		score = 0;
	}


	/**
	 * figure du hero
	 */
	@Override
	public String caption() {
		return HERO;
	}


	/**Getter
	 * @return the score
	 */
	public int getScore() {
		return score;
	}


	/**Setter
	 * @param score the score to set
	 */
	public void setScore() {
		++this.score;
	}
	
	

}
