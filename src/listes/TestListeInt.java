package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeInt {

	public static void main(String[] args) {

		//D�claration variables
		int elementLePlusGrand = 0;
		int elementLePlusPetit = 0;
		// Ins�rer les elements dans la liste
		ArrayList<Integer> listeEntiers = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

		// Afficher les �lements
		for (int i = 0; i < listeEntiers.size(); i++) {
			System.out.println(listeEntiers.get(i));
		}

		System.out.println("Taille de la liste : " + listeEntiers.size());

		// Rechercher l'�l�ment le plus grand
		for (int i = 0; i < listeEntiers.size(); i++) {
			if(listeEntiers.get(i)>elementLePlusGrand) {
				elementLePlusGrand = listeEntiers.get(i);
			}
		}
		System.out.println("L'�lement le plus grand de la liste est : "+elementLePlusGrand);
		
		// Rechercher l'�l�ment le plus petit
		for (int i = 0; i < listeEntiers.size(); i++) {
			if(listeEntiers.get(i)<elementLePlusPetit) {
				elementLePlusPetit = listeEntiers.get(i);
			}
		}
		
		//Retrait de l'�l�ment le plus petit
		for (int i = 0; i < listeEntiers.size(); i++) {
			if(listeEntiers.get(i)==elementLePlusPetit) {
				listeEntiers.remove(i);
			}
		}
		
		//Affichage de la liste, avec element retir�
		System.out.println("Liste avec le plus petit element retir� : ");
		for (int i = 0; i < listeEntiers.size(); i++) {
			System.out.println(listeEntiers.get(i));
		}
		
		// Recherchez tous les �l�ments n�gatifs et modifiez les de mani�re � ce qu�ils deviennent positifs
		for (int i = 0; i < listeEntiers.size(); i++) {
			if(listeEntiers.get(i)<0) {
				int element = listeEntiers.get(i);
				listeEntiers.remove(i);
				listeEntiers.add(Math.abs(element));
			}
		}

		//Affichage de la liste, avec les elements en positif
		System.out.println("Liste avec les elements n�gatifs devenu positifs : ");
		for (int i = 0; i < listeEntiers.size(); i++) {
			System.out.println(listeEntiers.get(i));
		}

	}

}
