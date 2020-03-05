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
	 * Permet de calculer le p�rimetre d'un cercle
	 * @param rayon
	 * @return
	 */
	public double perimetreCercle(double rayon) {
		double perimetre = 2 * Math.PI * rayon;
		System.out.println("Le p�rimetre est de : "+perimetre);
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
	 * @param D�fini le rayon
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	
	
	

}
