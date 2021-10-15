package fr.diginamic.recensement.modeles;

/**
 * Description de la class Ville ex : 
 * 
 *  code commune : 101
 *  commune : Paris 
 *  population : 2210875 
 * 
 * @author Yvan Palliès
 *
 */
public class Ville extends Region {

	private int commune;
	private String nomCommune;
	private long population;

	public Ville(String[] line) {
		super(Integer.parseInt(line[0]), line[1], line[2]);
		this.commune = Integer.parseInt(line[5]);
		this.nomCommune = line[6];
		this.population = Long.valueOf(line[9].replace(" ", ""));
	}

	@Override
	public String toString() {
		return "  code commune : " + commune + "   population : " + population + " \tcommune : " + nomCommune+"\t"+super.toString();
	}

	/**Getter
	 * @return the commune
	 */
	public int getCommune() {
		return commune;
	}

	/**Getter
	 * @return the nomCommune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/**Getter
	 * @return the population
	 */
	public long getPopulation() {
		return population;
	}


}
