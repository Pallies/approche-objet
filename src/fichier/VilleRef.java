package fichier;

public class VilleRef {
	private int codeRegion;
	private String region;
	private String codeDept;
	private int dept;
	private int canton;
	private int commune;
	private String nomCommune;
	private long habCommune;
	private long habApart;
	private long population;

	public VilleRef(String line) {
		String[] ref = line.split(";");
			this.codeRegion = Integer.parseInt(ref[0]);
			this.region = ref[1];
			this.codeDept = ref[2];
			this.dept = Integer.parseInt(ref[3]);
			this.canton = ref[4].equals("null") ? 0:Integer.parseInt(ref[4]);
			this.commune = Integer.parseInt(ref[5]);
			this.nomCommune = ref[6];
			this.habCommune = Long.valueOf(ref[7].replace(" ", ""));
			this.habApart = Long.valueOf(ref[8].replace(" ", ""));
			this.population = Long.valueOf(ref[9].replace(" ", ""));
	}

	/**Getter
	 * @return the population
	 */
	public long getPopulation() {
		return population;
	}

	@Override
	public String toString() {
		return codeDept+";" + nomCommune + ";" + population;
	}

}
