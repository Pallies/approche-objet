package fr.diginamic.banque;

import utils.Credit;
import utils.Debit;
import utils.Operation;

public class TestOperation {

	static double solde;

	public static void main(String[] args) {
		
		Operation[] operationRef = new Operation[4];
		
		Operation operation_1 = new Debit("02/10/2021", 672);
		Operation operation_2 = new Debit("30/07/2021", 123);
		Operation operation_3 = new Credit("12/07/2021", 986);
		Operation operation_4 = new Credit("09/03/2021", 568);
		
		operationRef[0] = operation_1;
		operationRef[1] = operation_2;
		operationRef[2] = operation_3;
		operationRef[3] = operation_4;
		
		for (int i = 0; i < operationRef.length; i++) {
			System.out.println(operationRef[i] + "  " + operationRef[i].getType());

			if (operationRef[i] instanceof Credit) {
				solde += operationRef[i].montant;
			} else {
				solde -= operationRef[i].montant;
			}
		}
		
		System.out.println(solde);
	}

}
