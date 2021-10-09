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
		if(piece==null)
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
}
