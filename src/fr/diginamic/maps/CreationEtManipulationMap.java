package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	/**
	 *  Tâches à réaliser :
		• Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux
		• Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
		• Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
		• Afficher la taille de la map
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		//Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
		System.out.println("-- Les clés de la map --");
		Iterator<Integer> iteratorCle = mapVilles.keySet().iterator();
		while(iteratorCle.hasNext()) {
			System.out.println(iteratorCle.next());
		}
		
		//Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
		System.out.println("-- Les valeurs de la map --");
		Iterator<String> values = mapVilles.values().iterator();
		while(values.hasNext()) {
			System.out.println(values.next());
		}
		
		//Afficher la taille de la map
		
		//Moyen d'afficher les valeurs depuis la clé
		System.out.println("-- Les valeurs de la map grace a l'id --");
		iteratorCle = mapVilles.keySet().iterator();
		while(iteratorCle.hasNext()) {
			Integer cle = iteratorCle.next();
			String valeur = mapVilles.get(cle);
			System.out.println(valeur);
		}
		
		System.out.println("Taille de la map :" + mapVilles.size());

	}

}
