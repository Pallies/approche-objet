package fr.diginamic.testenumeration;

import java.util.Arrays;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String[] args) {

		Ville usa = new Ville("Usa", 331_002_651, Continent.AMERIQUE);
		Ville france = new Ville("France", 65_273_511, Continent.EUROPE);
		Ville allemagne = new Ville("Allemagne", 83_783_942, Continent.EUROPE);
		Ville royaumUnie = new Ville("Uk", 67_886_011, Continent.EUROPE);
		Ville italie = new Ville("Italie", 60_461_826, Continent.EUROPE);
		Ville japon = new Ville("Japon", 126_476_461, Continent.ASIE);
		Ville chine = new Ville("Chine", 1_439_323_776, Continent.ASIE);
		Ville russie = new Ville("Russie", 145_934_462, Continent.ASIE);
		Ville inde = new Ville("Inde", 1_380_004_385, Continent.ASIE);
		
		List<Ville> villeDuMonde= Arrays.asList(usa,france,allemagne,royaumUnie,italie,japon,chine,russie,inde);
		
		for(Ville v: villeDuMonde) {
		System.out.println(v.toString());	
		}
		
	}

}
