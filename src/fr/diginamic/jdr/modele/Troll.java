package fr.diginamic.jdr.modele;

/**
 * Class du personnage TROLL
 * 
 * @author Yvan Palliès
 * 
 */
public class Troll extends Personnage {
	
	private static final String TROLL = "🐲";

	/** #Constructor
	 * 
	 */
	public Troll() {
		super(10, 15, 20, 30);
	}

	/**
	 * figure troll
	 */
	@Override
	public String caption() {
		return TROLL;
	}
}
