package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeInt {

	public static void main(String[] args) {

		//Déclaration variables
		int elementLePlusGrand = 0;
		int elementLePlusPetit = 0;
		// Insérer les elements dans la liste
		ArrayList<Integer> listeEntiers = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

		// Afficher les élements
		for (int i = 0; i < listeEntiers.size(); i++) {
			System.out.println(listeEntiers.get(i));
		}

		System.out.println("Taille de la liste : " + listeEntiers.size());

		// Rechercher l'élément le plus grand
		for (int i = 0; i < listeEntiers.size(); i++) {
			if(listeEntiers.get(i)>elementLePlusGrand) {
				elementLePlusGrand = listeEntiers.get(i);
			}
		}
		System.out.println("L'élement le plus grand de la liste est : "+elementLePlusGrand);
		
		// Rechercher l'élément le plus petit
		for (int i = 0; i < listeEntiers.size(); i++) {
			if(listeEntiers.get(i)<elementLePlusPetit) {
				elementLePlusPetit = listeEntiers.get(i);
			}
		}
		
		//Retrait de l'élément le plus petit
		for (int i = 0; i < listeEntiers.size(); i++) {
			if(listeEntiers.get(i)==elementLePlusPetit) {
				listeEntiers.remove(i);
			}
		}
		
		//Affichage de la liste, avec element retiré
		System.out.println("Liste avec le plus petit element retiré : ");
		for (int i = 0; i < listeEntiers.size(); i++) {
			System.out.println(listeEntiers.get(i));
		}
		
		// Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent positifs
		for (int i = 0; i < listeEntiers.size(); i++) {
			if(listeEntiers.get(i)<0) {
				int element = listeEntiers.get(i);
				listeEntiers.remove(i);
				listeEntiers.add(Math.abs(element));
			}
		}

		//Affichage de la liste, avec les elements en positif
		System.out.println("Liste avec les elements négatifs devenu positifs : ");
		for (int i = 0; i < listeEntiers.size(); i++) {
			System.out.println(listeEntiers.get(i));
		}

	}

}
