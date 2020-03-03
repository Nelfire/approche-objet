package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonnage {
	
	public static void main (String[] args) {
		
		AdressePostale ad = new AdressePostale(5, "Rue du carefour", 12000, "Grignan");

		Personne p1 = new Personne("Girard","Vincent");
		Personne p2 = new Personne("Girard","Ludovic",ad);
		
		p1.getNom();
		p1.setAdresse(ad);
		
		
	}

}
