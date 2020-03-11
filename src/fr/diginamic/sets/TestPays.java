package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Pays> setString = new HashSet<>(Arrays.asList(new Pays("USA", 327.2, 57638d), new Pays("France", 66.99, 43551d),
	            new Pays("Allemagne", 82.79, 50200d), new Pays("UK", 66.44, 43620d), new Pays("Italie", 60.48, 37970d),
	            new Pays("Japon", 126.8, 42659d), new Pays("Chine", 1_395.380, 16624d), new Pays("Russie", 146.780, 27900d),
	            new Pays("Inde", 1_368.163, 5174d)));
		
		Iterator<Pays> iterator = setString.iterator();

		
		
		// 3) • Recherchez le pays avec le PIB/habitant le plus important
		double pibLePlusImportant = 0;
		Pays payAvecPibMax1 = iterator.next();
		
		while(iterator.hasNext()) {
			Pays pays = iterator.next();
			if(pays.getPIB() > pibLePlusImportant) {
				pibLePlusImportant = pays.getPIB();
				payAvecPibMax1 = pays;
			}
		}
		System.out.println("-----  Recherchez le pays avec le PIB/habitant le plus important : ");
		System.out.println(payAvecPibMax1.getNom() + " avec PIB : " + payAvecPibMax1.getPIB());
		
		
		
		// 4) • Recherchez le pays avec le PIB total le plus important
		iterator = setString.iterator();
		double pibLePlusImportantTotal = 0;
		Pays payAvecPibMax = iterator.next();
		
		while(iterator.hasNext()) {
			Pays pays = iterator.next();
			if(pays.getPIB()*pays.getNbHabitants() > pibLePlusImportantTotal) {
				pibLePlusImportantTotal = pays.getPIB()*pays.getNbHabitants();
				payAvecPibMax = pays;
			}
		}
		System.out.println("-- Pays avec le PIB/habitant le plus important : "+payAvecPibMax.getNom() + " avec PIB : " + payAvecPibMax.getPIB()*payAvecPibMax.getNbHabitants());
		
		
		
		//5) Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit 
		iterator = setString.iterator();
		double pibLePlusPetitTotal = 0;
		Pays payAvecPibMin = iterator.next();
		
		while(iterator.hasNext()) {
			Pays pays = iterator.next();
			if(pays.getPIB()*pays.getNbHabitants() < pibLePlusPetitTotal) {
				pibLePlusImportantTotal = pays.getPIB()*pays.getNbHabitants();
				payAvecPibMin = pays;
			}
		}
		payAvecPibMin.setNom(payAvecPibMin.getNom().toUpperCase());
		
		System.out.println("Pays avec pib minimum : " + payAvecPibMin);
		
		
		
		//6) Supprimez le pays dont le PIB total est le plus petit
		setString.remove(payAvecPibMin);
		System.out.println("-- Suppression du pays avec PIB min --");

		//7) Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB total
		iterator = setString.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
	
		}
		
	}

}
