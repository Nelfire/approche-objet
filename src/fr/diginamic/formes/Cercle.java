package fr.diginamic.formes;

public class Cercle extends Forme{
	
	/** le rayon du cercle */
	double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	@Override
	public double calculerSurface() {
		double surface = Math.PI * rayon * rayon;
		return surface;
	}

	@Override
	public double calculerPerimetre() {
		double perimetre = 2 * Math.PI * rayon;
		return perimetre;
	}
	


}
