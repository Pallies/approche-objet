package fr.diginamic.recensement.menu;

import java.util.Scanner;

public abstract class MenuService {
	public abstract void traiter(Scanner scanner);

	public abstract int choixFilter(Scanner scanner);

	public abstract void choixMenu(int key,Scanner scanner);
	
}
