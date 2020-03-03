package entites;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adresse;


	/**
	 * @param nvNom => nom de la personne
	 * @param nvPrenom => prenom de la personne
	 */
	public Personne(String nvNom, String nvPrenom) { // Le constructeur doit avoir le même nom que la classe
		nom = nvNom;
		prenom = nvPrenom;
	}

	/**
	 * @param nvNom => nom de la personne
	 * @param nvPrenom => prenom de la personne
	 * @param a => adresse de la personne
	 */
	public Personne(String nvNom, String nvPrenom, AdressePostale a) {
		// this(nvNom, nvPrenom);   on peut virer les deux lignes suivantes et écrire ça a la place
		nom = nvNom;
		prenom = nvPrenom;
		this.adresse = a;
	}

	public void afficherNomEnMajuscule() {
		System.out.println(nom.toUpperCase() +" "+ prenom);
	}

	public void modifierNom(String nNom) {
		this.nom = nNom;
		afficherNomEnMajuscule();
	}

	
	/**
	 * Modifier le prénom
	 * @param nPrenom => prénom de la personne
	 */
	public void modifierPrenom(String nPrenom) {
		this.prenom = nPrenom;
		afficherNomEnMajuscule();
	}

	/**
	 * Permet de modifier l'adresse
	 * @param nAdresse => Adresse de la personne
	 */
	public void modifierAdresse(AdressePostale nAdresse) {
		this.adresse = nAdresse;
	}

	/**
	 * @return Retourner le nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param Définir un nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return Retourner le prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param Définir un prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return Retourner une adresse
	 */
	public AdressePostale getAdresse() {
		return adresse;
	}

	/**
	 * @param Définir une adresse
	 */
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}

	
	
	




}
