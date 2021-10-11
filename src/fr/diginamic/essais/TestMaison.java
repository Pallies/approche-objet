package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Maison.PieceObject;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

public class TestMaison {

	public static void main(String[] args) {

		Chambre chambre1 = new Chambre(11, 1);
		Chambre chambre2 = new Chambre(13, 1);
		Chambre chambre3 = new Chambre(12, 1);
		Cuisine cuisine = new Cuisine(11, 0);
		Salon salon = new Salon(24, 0);
		SalleDeBain salleDeBain1 = new SalleDeBain(7.5, 0);
		SalleDeBain salleDeBain2 = new SalleDeBain(10, 1);
		Wc wc1 = new Wc(7.5, 0);
		Wc wc2 = new Wc(4, 1);

		Maison maison = new Maison();
		maison.addPiece(chambre1);
		maison.addPiece(chambre2);
		maison.addPiece(chambre3);
		maison.addPiece(cuisine);
		maison.addPiece(null);
		maison.addPiece(salon);
		maison.addPiece(salleDeBain1);
		maison.addPiece(salleDeBain2);
		maison.addPiece(wc1);
		maison.addPiece(wc2);

		double area = maison.totalArea();
		System.out.println("Superficie totale : "+area);
		area = maison.totalAreaByFloor(1);
		System.out.println("Superficie de l'étage 1 : "+area);
		area = maison.totalAreaByRoom(chambre2);
		System.out.println("Superficie des chambres : "+area);
		int nb = maison.totalByRooms(chambre2);
		System.out.println("Nombre de pièces : "+nb+ " "+chambre2.getClass().getSimpleName());
		PieceObject piece = maison.totalAreaByRoomOrRooms(chambre3);
		System.out.println("Superficie de(s) "+piece.getInstanceObject()+"(s) "+piece.getAreaRoom()+" nbre de pièce(s) "+piece.getNbRoom());
		
	}

}
