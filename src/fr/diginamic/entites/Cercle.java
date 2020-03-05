package fr.diginamic.entites;

public class Cercle {
	
	/** rayon du cercle */
	private double rayon;

	/** Constructeur du cercle
	 * @param rayon
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	

	/**
	 * Permet de calculer le périmetre d'un cercle
	 * @param rayon
	 * @return
	 */
	public double perimetreCercle(double rayon) {
		double perimetre = 2 * Math.PI * rayon;
		System.out.println("Le périmetre est de : "+perimetre);
		return perimetre;
	}
	
	/**
	 * Permet de calculer la surface d'un cercle
	 * @param rayon
	 * @return
	 */
	public double surfaceCercle(double rayon) {
		double surface = Math.PI * rayon * rayon;
		System.out.println("La surface est de : "+surface);
		return surface;
	}


	/** Getter
	 * @return Retourne le rayon
	 */
	public double getRayon() {
		return rayon;
	}


	/** Setter
	 * @param Défini le rayon
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	
	
	

}
