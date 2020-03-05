package fr.diginamic.formes;

public class Rectangle extends Forme {

	/** longueur du rectangle */
	double longueur;
	/** largeur du rectangle */
	double largeur;
	
	/** Constructeur
	 * @param longueur du rectangle
	 * @param largeur du rectangle
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
	public double calculerSurface() {
		double surface = longueur*largeur;
		return surface;
	}

	@Override
	public double calculerPerimetre() {
		double perimetre = longueur*2+largeur*2;
		return perimetre;
	}



	
}
