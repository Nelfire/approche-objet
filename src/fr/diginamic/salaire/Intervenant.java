package fr.diginamic.salaire;

public abstract class Intervenant {
	
	private String nom;
	private String prenom;
	

	public abstract double getSalaire();

	/**
	 * La classe Intervenant a une nouvelle méthode: Cette méthode s’appelle afficherDonnees et affiche toutes les données concernant un intervenant :
	 */
	public void afficherDonnees() {
		System.out.println("Nom : "+this.nom + ", Prenom : "+this.prenom + ", Salaire: "+this.getSalaire() + ", Statut : "+ getStatus());
	}

	protected abstract String getStatus();

	/** Constructeur
	 * @param nom
	 * @param prenom
	 */
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
}
