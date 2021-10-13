package fr.diginamic.swing.jdr.personnage;
/**
 * Class du personnage créature LOUP
 * 
 * @author Yvan Palliès
 * 
 */
public class Loup extends Creature {

	private static final String LOUP = "🐺";

	/** #Constructor
	 * 
	 */
	public Loup() {
		super(3, 8, 5, 10);
	}

	/**
	 * figure loup
	 */
	@Override
	public String caption() {
		return LOUP;

	}

}
