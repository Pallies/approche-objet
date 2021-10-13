package fr.diginamic.swing.jdr.personnage;

/**
 * Class du personnage créature TROLL
 * 
 * @author Yvan Palliès
 * 
 */
public class Troll extends Creature {
	
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
