package fr.diginamic.jdr.modele;

/**
 * Class du personnage LOUP
 * 
 * @author Yvan Palliès
 * 
 */
public class Loup extends Personnage {

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
