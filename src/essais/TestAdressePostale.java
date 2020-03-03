package essais;

import entites.AdressePostale;

public class TestAdressePostale {
	
	public static void main(String[] args) {

		AdressePostale ad = new AdressePostale();
		ad.numeroRue = 5;
		ad.libelleRue = "rue du ciel";
		ad.codePostal = 84000;
		ad.ville = "Crillon";
		
		AdressePostale ad1 = new AdressePostale();
		ad1.numeroRue = 4;
		ad1.libelleRue = "rue du terre";
		ad1.codePostal = 82000;
		ad1.ville = "Bloup";
		
	}

}
