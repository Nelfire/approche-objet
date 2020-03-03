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

	public void afficherNomEnMajuscule() {
		System.out.println(nom.toUpperCase() +" "+ prenom);
	}

	public void modifierNom(String nNom) {
		this.nom = nNom;
		System.out.println(nom.toUpperCase() +" "+ prenom);
	}

	public void modifierPrenom(String nPrenom) {
		this.prenom = nPrenom;
		System.out.println(nom.toUpperCase() +" "+ prenom);
	}

	public void modifierAdresse(AdressePostale nAdresse) {
		this.adresse = nAdresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getAdresse() {
		return adresse;
	}

	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	
	




}
