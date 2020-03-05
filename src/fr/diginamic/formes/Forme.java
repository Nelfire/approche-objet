package fr.diginamic.formes;

public abstract class Forme {
	
	public Forme() {}

	/**
	 * Permet de calculer la surface
	 * @return
	 */
	public abstract double calculerSurface();
	
	/**
	 * Permet de calculer le perimetre
	 * @return
	 */
	public abstract double calculerPerimetre();
	
}
