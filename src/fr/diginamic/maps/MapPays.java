package fr.diginamic.maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import fr.diginamic.sets.Pays;

public class MapPays {

	public static void main(String[] args) {

		Set<Pays> setPays = new HashSet<>(Arrays.asList(new Pays("USA", 327.2, 57638d), new Pays("France", 66.99, 43551d),
	            new Pays("Allemagne", 82.79, 50200d), new Pays("UK", 66.44, 43620d), new Pays("Italie", 60.48, 37970d),
	            new Pays("Japon", 126.8, 42659d), new Pays("Chine", 1_395.380, 16624d), new Pays("Russie", 146.780, 27900d),
	            new Pays("Inde", 1_368.163, 5174d)));
		
		//Création de la map
		HashMap<String, Pays> mapPays = new HashMap<>();
		for (Pays pays : setPays) {
			mapPays.put(pays.getNom(), pays);
		}
		
		// Parcous de la map à la recherche du plus petit pays
		Collection<Pays> collPays = mapPays.values();
		Iterator<Pays> iterPays = collPays.iterator();
		
		Pays plusPetitPays = iterPays.next();
		while(iterPays.hasNext()) {
			Pays courant = iterPays.next();
			if (courant.getNbHabitants() < plusPetitPays.getNbHabitants()) {
				plusPetitPays = courant;
			}
		}
		System.out.println(plusPetitPays);
		mapPays.remove(plusPetitPays.getNom());
		System.out.println("------------");
		//Affichage du resultat final
		for(Pays pays: collPays) {
			System.out.println(pays);
		}

	}

}
