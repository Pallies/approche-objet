package fr.diginamic.jdr.modele;

public class Gobelin extends Personnage {

	private static final String GOBELIN = "🐸";

	/** #Constructor
	 * 
	 */
	public Gobelin() {
		super(5, 10, 10, 15);
	}


	/**
	 * figure du gobelin
	 */
	@Override
	public String caption() {
		return GOBELIN;
	}
}
