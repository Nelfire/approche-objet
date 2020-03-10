package fr.diginamic.sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double elementLePlusGrand = 0.00;
		double elementLePlusPetit = 1000000;
		HashSet<Double> set = new HashSet<>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));

		// Affichez tous les éléments de la collection

		System.out.println("Tous les elements du tableau");
		for (Double valeur : set) {
			System.out.println(valeur);
		}

		// Récupérer l'element le plus grand
		for (Double valeur : set) {
			if (valeur > elementLePlusGrand) {
				elementLePlusGrand = valeur;
			}
		}

		System.out.println("Element le plus grand : " + elementLePlusGrand);

		// Récupérer l'element le plus petit
		for (Double valeur : set) {
			if (valeur < elementLePlusPetit) {
				elementLePlusPetit = valeur;
			}
		}

		System.out.println("Element le plus petit : " + elementLePlusPetit);
		
		// Supprimez le plus petit élément de la collection
		
		
		

	}

}
