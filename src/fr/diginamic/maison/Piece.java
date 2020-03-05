package fr.diginamic.maison;

public abstract class Piece {

	
	/** superficie de la piece */
	protected double superficie;
	/** le num�ro de l��tage. On considerera par convention que l��tage 0 d�signe le RDC, 1 le 1er �tage, et ainsi de suite.. */
	protected int numeroEtage;
	
	/** Constructeur
	 * @param superficie de la piece
	 * @param numero Etage de la piece
	 */
	public Piece(double superficie, int numeroEtage) {
		super();
		this.superficie = superficie;
		this.numeroEtage = numeroEtage;
	}

	/** Getter
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/** Setter
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/** Getter
	 * @return the numeroEtage
	 */
	public int getNumeroEtage() {
		return numeroEtage;
	}

	/** Setter
	 * @param numeroEtage the numeroEtage to set
	 */
	public void setNumeroEtage(int numeroEtage) {
		this.numeroEtage = numeroEtage;
	}
	
	
}
