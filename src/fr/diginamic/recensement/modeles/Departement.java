package fr.diginamic.recensement.modeles;

import java.util.function.Function;
import java.util.function.Predicate;

public class Departement implements Predicate<Ville>,Function<Ville, Departement>{

	private String codeDept;

	public Departement(String codeDept) {
		this.codeDept = codeDept;
	}
	@Override
	public boolean test(Ville v) {
		return v.getCodeDept().length()<3;
	}
	
	@Override
	public Departement apply(Ville t) {
		
		return null;
	}

	@Override
	public String toString() {
		return "  codeDept :  " + codeDept;
	}

	/**
	 * Getter
	 * 
	 * @return the codeDept
	 */
	public String getCodeDept() {
		return codeDept;
	}


}
