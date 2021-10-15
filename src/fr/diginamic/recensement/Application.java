package fr.diginamic.recensement;

import java.util.Scanner;

import fr.diginamic.recensement.controller.Recensement;
import fr.diginamic.recensement.menu.Menu;

public class Application {

	public static void main(String[] args) {
		Recensement.getInstance();
		Menu menu=new Menu();
		Scanner scanner = new Scanner(System.in);
		menu.traiter(scanner);
	}
}
