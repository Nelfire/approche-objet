package entites;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adresse;


	public Personne(String nvNom, String nvPrenom) { // Le constructeur doit avoir le même nom que la classe
		nom = nvNom;
		prenom = nvPrenom;
	}

	public Personne(String nvNom, String nvPrenom, AdressePostale a) {
		nom = nvNom;
		prenom = nvPrenom;
		this.adresse = a;
	}
}
