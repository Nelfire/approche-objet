package fr.diginamic.maison;


public class Maison {

	/** tableau de pieces */
	private Piece[] pieces;
	
	/** Constructeur
	 * @param tableauPiece
	 */
	public Maison() {
		this.pieces = new Piece[0];
	}

	
	/**
	 * cette classe poss�de une m�thode ajouterPiece qui permet d�ajouter une pi�ce
	 * � la maison
	 */
	public void ajouterPiece(Piece piece) {
		
		if(piece.getSuperficie() > 0 && piece.getNumeroEtage()>=0) {
			// On cr�e un tableau temporaire plus grand d'une case que le tableau pr�c�dent
			Piece[] tmp = new Piece[pieces.length + 1];

			// On stocke toutes les valeurs du tableau pr�c�dent dans le nouveau tableau
			for (int i = 0; i < tmp.length - 1 && pieces.length > 0; i++) {
				tmp[i] = pieces[i];
			}

			// Puis en fin de tableau, on stocke la valeur saisie
			tmp[tmp.length - 1] = piece;

			// On affecte enfin le tableau tmp au tableau tab
			pieces = tmp;
		}

	}

	/**
	 * cette classe poss�de une m�thode qui retourne la superficie totale de la
	 * maison
	 * 
	 * @return
	 */
	public double getSuperficieTotale() {
		double superficieTotal = 0.0;
		for (int i = 0; i < pieces.length; i++) {
			superficieTotal = superficieTotal + pieces[i].getSuperficie();
		}
		return superficieTotal;
	}
	

	/**
	 * cette classe a une m�thode qui retourne la superficie d�un �tage donn�.
	 * 
	 * @return
	 */
	public double getSuperficieEtage(int etage) {
		double superficieEtage = 0.0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].numeroEtage == etage) {
				superficieEtage = superficieEtage + pieces[i].getSuperficie();
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



	
	
}
