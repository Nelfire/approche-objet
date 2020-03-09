package fr.diginamic.formesInterface;

public class Rectangle implements ObjetGeometrique {

	/** Longueur du rectangle */
	public double Longueur;
	/** Largeur du rectangle */
	public double Largeur;

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 2*(Longueur + Largeur);
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return Longueur * Largeur;
	}

	/** Constructeur
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		Longueur = longueur;
		Largeur = largeur;
	}

	@Override
	public String toString() {
		return "Rectangle [Longueur=" + Longueur + ", Largeur=" + Largeur + "]";
	}
	

}
