package fr.diginamic.recensement.services;

/**
 * Class Abstraite 
 * @see Child Class 
 * DeptService
 * RegionService
 * VilleService
 * @author Yvan Palliès
 *
 */
public abstract class ActionService {

	public abstract void populationTypeDonnee(String key);
	
	public void populationTypeDonnee(int ville) {
	}
	
	public void dixAvecPlusPopulation() {
	}

	public void dixVilles(String key) {
	}
}
