package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonnage {
	
	public static void main (String[] args) {
		
		AdressePostale ad = new AdressePostale();
		ad.numeroRue = 5;
		ad.libelleRue = "rue du ciel";
		ad.codePostal = 84000;
		ad.ville = "Crillon";
		
		Personne p1 = new Personne();
		p1.nom = "GIRARD";
		p1.prenom = "Vincent";
		p1.adresse = ad;
		
		
	}

}
