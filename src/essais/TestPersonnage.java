package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonnage {
	
	public static void main (String[] args) {
		
		//Cr�er une instance d'adresse
		AdressePostale ad = new AdressePostale(5, "Rue du carefour", 12000, "Grignan");

		//Cr�er instance de personnes
		Personne p1 = new Personne("Girard","Vincent");
		Personne p2 = new Personne("Girard","Ludovic",ad);
		
		//D�finir un nouveau nom
		p1.setNom("Brunel");
		p1.setAdresse(new AdressePostale(20, "Boulevard", 20000, "Modene"));
		p1.getNom();
		
		String nom1 = p1.getNom();
		System.out.println(nom1);
		
		//R�cup�rer pr�nom de p1
		String prenom1 = p1.getPrenom();
		System.out.println(prenom1);
		
		//R�cup�rer adresse de p1
		AdressePostale adr1 = p1.getAdresse();
		System.out.println(adr1);
		
		
	}

}
