package fr.diginamic.swing.jdr.personnage;

/**
 * Class du personnage créature GOBELIN
 * 
 * @author Yvan Palliès
 * 
 */
public class Gobelin extends Creature {

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
