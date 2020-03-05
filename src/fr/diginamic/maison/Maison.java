package fr.diginamic.maison;


public class Maison {

	private Piece[] tableauPiece;

	/**
	 * cette classe possède une méthode ajouterPiece qui permet d’ajouter une pièce
	 * à la maison
	 */
	public void ajouterPiece(Piece piece) {

		// On crée un tableau temporaire plus grand d'une case que le tableau précédent
		Piece[] tmp = new Piece[tableauPiece.length + 1];

		// On stocke toutes les valeurs du tableau précédent dans le nouveau tableau
		for (int i = 0; i < tmp.length - 1 && tableauPiece.length > 0; i++) {
			tmp[i] = tableauPiece[i];
		}

		// Puis en fin de tableau, on stocke la valeur saisie
		tmp[tmp.length - 1] = piece;

		// On affecte enfin le tableau tmp au tableau tab
		tableauPiece = tmp;

	}

	/**
	 * cette classe possède une méthode qui retourne la superficie totale de la
	 * maison
	 * 
	 * @return
	 */
	public double getSuperficieTotale() {
		double superficieTotal = 0;
		for (int i = 0; i < tableauPiece.length; i++) {
			superficieTotal = superficieTotal + tableauPiece[i].getSuperficie();
		}
		return superficieTotal;
	}
	

	/**
	 * cette classe a une méthode qui retourne la superficie d’un étage donné.
	 * 
	 * @return
	 */
	public double getSuperficieEtage(int etage) {
		double superficieEtage = 0;
		for (int i = 0; i < tableauPiece.length; i++) {
			if (tableauPiece[i].numeroEtage == etage) {
				superficieEtage = superficieEtage + tableauPiece[i].getSuperficie();
			}
		}
		return superficieEtage;
	}
	
//	public int getNbPiecesParTypePiece(int type) {
//		
//		int nbPieceParTypePiece = 0;
//		for (int i = 0; i < tableauPiece.length; i++) {
//			if (tableauPiece[i].numeroEtage == type) {
//				superficieEtage = superficieEtage + tableauPiece[i].getSuperficie();
//			}
//		}
//		return nbPieceParTypePiece;
//	}

	/** Constructeur
	 * @param tableauPiece
	 */
	public Maison(Piece[] tableauPiece) {
		super();
		this.tableauPiece = tableauPiece;
	}
	
	
}
