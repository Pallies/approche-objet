package fr.diginamic.testenumeration;

public enum Continent {
	ASIE("Asie"), AFRIQUE("Afrique"), AMERIQUE("Amerique"), EUROPE("Europe"), OCEANIE("Oceanie");

	private String continent;

	private Continent(String continent) {
		this.continent = continent;
	}

	/**Getter
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}
	

}
