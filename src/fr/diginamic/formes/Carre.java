package fr.diginamic.formes;

public class Carre extends Forme {

	/** longueur du carré */
	double longueur;
	
	public Carre (double longueur) {
		this.longueur = longueur;
	}
	
	@Override
	public double calculerSurface() {
		double surface = longueur*2;
		return surface;
	}

	@Override
	public double calculerPerimetre() {
		double perimetre = longueur*4;
		return perimetre;
	}
	
	

}
