package fr.diginamic.recensement.services;

import java.util.Optional;

import fr.diginamic.recensement.controller.Recensement;
import fr.diginamic.recensement.modeles.Ville;
import fr.diginamic.recensement.utils.EqualsVille;
import fr.diginamic.recensement.utils.MapHabToVille;

public class VilleService extends ActionService{

	
	
//	- 1. Population d’une ville donnée
	@Override
	public void populationTypeDonnee(int ville) {
	Optional<Ville> villeFind=	Recensement.getInstance().stream().filter(new EqualsVille(ville)).findFirst();
	if(villeFind.isPresent())
		villeFind.stream().map(new MapHabToVille()).forEach(System.out::println);
	}
//	- 1. Population d’une ville donnée
	public void populationTypeDonnee(String ville) {
	Optional<Ville> villeFind=	Recensement.getInstance().stream().filter(new EqualsVille(ville)).findFirst();
	if(villeFind.isPresent())
		villeFind.stream().map(new MapHabToVille()).forEach(System.out::println);
	}
}
