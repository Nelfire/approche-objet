package fr.diginamic.sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double elementLePlusGrand = 0.00;
		double elementLePlusPetit = 1000000;
		HashSet<Double> set = new HashSet<>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));

		//4) Affichez tous les éléments de la collection

		System.out.println("Tous les elements du tableau (Iterator) :");
		
		//Avec iterator
		Iterator<Double> a = set.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		//		for (int i = 0; i < args.length; i++) {
		//			String string = args[i];
		//			
		//		}
		
		//Avec boucle objets
		System.out.println("Tous les elements du tableau (Boucle d'objets) :");
		for (Double valeur : set) {
			System.out.println(valeur);
		}

		// 5) Recherchez le plus grand élément de la collection
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
		
		// 6) Supprimez le plus petit élément de la collection
		// Supprimez le plus petit élément de la collection
		
		for (Double valeur : set) {
			if(valeur == elementLePlusPetit) {
				set.remove(valeur);
			}
		}
		
		// 7) Affichez enfin le contenu de la collection ainsi modifiée
		System.out.println("Tous les elements du tableau - element le plus petit :");
		//Avec boucle objets
		for (Double valeur : set) {
			System.out.println(valeur);
		}
		
		

	}

}
