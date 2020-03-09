package fr.diginamic.formesInterface;

public class Cercle implements ObjetGeometrique {
	
	/** Rayon du cercle */
	public double rayon;
	
	

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * rayon;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return Math.PI * rayon * rayon;
	}

	/** Constructeur
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	
}
