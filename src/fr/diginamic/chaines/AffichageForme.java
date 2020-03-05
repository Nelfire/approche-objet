package fr.diginamic.chaines;

import fr.diginamic.formes.Forme;

public class AffichageForme {
	
	
	/**
	 * Permeet d'afficher la surface et le perimetre de la forme passée en parametre
	 * @param forme
	 */
	public static void afficher(Forme forme) {
		System.out.println("Surface : "+forme.calculerSurface() + "Perimetre : "+forme.calculerPerimetre());
	}

}
