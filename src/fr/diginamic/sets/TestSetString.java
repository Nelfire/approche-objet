package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {

		HashSet<String> setPays = new HashSet<>();
		setPays.add("USA");
		setPays.add("France");
		setPays.add("Allemagne");
		setPays.add("UK");
		setPays.add("Italie");
		setPays.add("Japon");
		setPays.add("Chine");
		setPays.add("Russie");
		setPays.add("Inde");
		
		//Création d'un iterator
		Iterator<String> iterator = setPays.iterator();
		System.out.println("---- Liste des pays.");
		//Affichage des pays
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

		int nbLettres = 0;
		String nomPays = "";


		iterator = setPays.iterator();
		// 3) Recherchez le pays dans cette liste qui a le plus grand nombre de lettres
		while(iterator.hasNext()) {
			String pays = iterator.next();
			if(pays.length() > nbLettres) {
				nbLettres = pays.length();
				nomPays = pays;
			}
		}
		System.out.println("---- Le pays avec le plus de nombre de lettres est : "+nomPays+" avec "+nbLettres+" lettres.");
		
		// 4) Supprimez ce pays
		setPays.remove(nomPays);
		
		iterator = setPays.iterator();
		System.out.println("---- Pays sans le pays le plus long :");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
