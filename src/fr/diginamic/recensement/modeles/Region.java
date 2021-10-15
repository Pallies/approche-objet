package fr.diginamic.recensement.modeles;

public class Region extends Departement {
	private int codeRegion;
	private String region;

	public Region(int codeRegion, String region, String codeDept) {
		super(codeDept);
		this.codeRegion = codeRegion;
		this.region = region;
	}

	@Override
	public String toString() {
		return "  codeRegion :  " + codeRegion + ", region : " + region +"\t"+super.toString();
	}

	/**
	 * Getter
	 * 
	 * @return the codeRegion
	 */
	public int getCodeRegion() {
		return codeRegion;
	}

	/**
	 * Getter
	 * 
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

}
