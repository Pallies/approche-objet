package fr.diginamic.operations;

public class Operations {

	public static double calcul(double chiffre1, double chiffre2, char operateur) {

		switch (operateur) {
		case '+':
			return chiffre1 + chiffre2;
		case '-':
			return chiffre1 - chiffre2;
		case '*':
			return chiffre1 * chiffre2;
		case '/':
			return chiffre1 / chiffre2;		// /0 infinity		
		default:
			return 0;
		}

	}

}
