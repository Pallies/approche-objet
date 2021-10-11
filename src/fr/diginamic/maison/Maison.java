package fr.diginamic.maison;

public class Maison {

	private Piece[] piece = new Piece[0];

	/**
	 * Ajoute une pièce à la Maison création d'un tableau de taille supérieur
	 * réafectation de l'ancien tableau puis affectation de la pièce
	 * 
	 * exclu les pieces null
	 */
	public void addPiece(Piece piece) {
		if (piece == null)
			return;

		int sizeTab = this.piece.length;
		Piece[] pieceLarge = new Piece[sizeTab + 1];

		for (int i = 0; i < sizeTab; i++) {
			pieceLarge[i] = this.piece[i];
		}
		pieceLarge[sizeTab] = piece;
		this.piece = pieceLarge;
	}

	/**
	 * 
	 * @return la superficie totale de la maison
	 */
	public double totalArea() {
		double area = 0;
		for (Piece p : this.piece) {
			area += p.getSuperficie();
		}
		return area;
	}

	/**
	 * @param etage
	 * @return la superficie de l'étage donné.
	 */
	public double totalAreaByFloor(int etage) {
		double area = 0;
		for (Piece p : this.piece) {
			if (etage == p.getEtage())
				area += p.getSuperficie();
		}
		return area;
	}

	/**
	 * donne la Superficie 
	 * en fonction du type de pièce
	 * @param piece
	 * @return double
	 */
	public double totalAreaByRoom(Piece piece) {
		double area = 0;
		for (Piece p : this.piece) {
			if (p.equals(piece))
				area += p.getSuperficie();
		}
		return area;
	}
	
	/**
	 * donne le nombre total de piece 
	 * en fonction du type de pièce
	 * @param piece
	 * @return int
	 */
	public int totalByRooms(Piece piece) {
		int room = 0;
		for (Piece p : this.piece) {
			if (p.equals(piece)) {
				room++;
			}
		}
		return room;
	}
	
	/**
	 * donne un objet
	 * avec 2 attributs privés
	 * getNbRooms() 
	 * nb de piece en fonction du type de pièce
	 * getAreaRoom()
	 * Superficie en fonction du type de pièce 
	 * @param piece
	 * @return int
	 */
	public PieceObject totalAreaByRoomOrRooms(Piece piece) {
		PieceObject room = new PieceObject(0, 0,piece);
		for (Piece p : this.piece) {
			if (p.equals(piece)) {
				room.areaRoom += p.getSuperficie();
				room.nbRoom++;
			}
		}
		return room;
	}

	/**
	 * test de création d'un objet
	 * pour éviter la réecriture de la même fonction
	 * !? demande autant de ligne sinon plus ....
	 * 
	 * @author Yvan Palliès
	 *
	 */
	public class PieceObject {
		int nbRoom;
		double areaRoom;
		String instanceObject;
		public PieceObject(int nb, double area,Piece p) {
			nbRoom = nb;
			areaRoom = area;
			instanceObject=p.getClass().getSimpleName();
		}

		/**
		 * Getter
		 * 
		 * @return the nbRoom
		 */
		public int getNbRoom() {
			return nbRoom;
		}

		/**
		 * Getter
		 * 
		 * @return the areaRoom
		 */
		public double getAreaRoom() {
			return areaRoom;
		}

		/**Getter
		 * @return the instanceObject
		 */
		public String getInstanceObject() {
			return instanceObject;
		}
	}
}
