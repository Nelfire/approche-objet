package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

/**
Exercice 3
• Soit la classe exécutable suivante :
o Dans cette classe, on a constitué 2 maps différentes, nommées map1 et map2
o Ces maps contiennent des couleurs stockées en fonction d’un index

 *
 */
public class FusionMap {
	public static void main(String args[]) {
		
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		

		// Création map3
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		Iterator<Integer> iteratorMap3 = map3.keySet().iterator();

		Iterator<Integer> iteratorMap1 = map1.keySet().iterator();
		// map 1 + map 2 ---> map 3
		while(iteratorMap1.hasNext()) {
			Integer cle1 = iteratorMap1.next();
			String valeur1 = map1.get(cle1);
			map3.put(cle1, valeur1);
		}
		
		Iterator<Integer> iteratorMap2 = map2.keySet().iterator();
		while(iteratorMap2.hasNext()) {
			Integer cle2 = iteratorMap2.next();
			String valeur2 = map2.get(cle2);
			map3.put(cle2, valeur2);
		}
		
		
		//Moyen d'afficher les valeurs depuis la clé
		System.out.println("-- Contenu tableau 3 --");
		iteratorMap3 = map3.keySet().iterator();
		while(iteratorMap3.hasNext()) {
			Integer cle = iteratorMap3.next();
			String valeur = map3.get(cle);
			System.out.println(cle+ "--> "+valeur);
		}
		
	}
}