package fr.diginamic.chaines;

import java.util.Iterator;

public class ManipulationChaine {
	private String chaine = "Durand;Marcel;2 523.5";

	char firstCaracter = chaine.charAt(0);

	/**
	 * 
	 * @return firstLetter
	 */
	public String getCapitalString() {
		return String.valueOf(chaine.charAt(0));
	}

	/**
	 * @return caracters number of the string
	 */
	public int getLengthString() {
		return chaine.length();
	}

	/**
	 * use split()
	 * 
	 * @return fullname
	 */
	public String fullNameSplit(String size) {
		String[] strString = chaine.split(";");
		for (int i = 0; i < 2; i++) {
			if (size.contentEquals("upper") && i == 0) {
				strString[i] = strString[i].toUpperCase();
			} else {
				strString[i] = strString[i].toLowerCase();
			}
		}
		return strString[0] + " " + strString[1];
	}

	/**
	 * use substring and indexOf
	 * 
	 * @return fullName
	 */
	public String fullName() {
		int end = 0;
		String resteString = chaine;
		String strString = "";
		while (resteString.indexOf(";") != -1) {
			end = resteString.indexOf(";");
			strString += resteString.substring(0, end) + " ";
			resteString = resteString.substring(end + 1);
			System.out.println(resteString);
		}
		return strString;
	}
	
	/**
	 * separate word in the table
	 * @return String[]
	 */
	public String[] splitMethod() {
		return chaine.split(";");
	}
}
