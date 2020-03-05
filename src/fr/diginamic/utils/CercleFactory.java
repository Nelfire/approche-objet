package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

	public static Cercle creerCercle (double val) {
		return new Cercle(val);
	}

}
