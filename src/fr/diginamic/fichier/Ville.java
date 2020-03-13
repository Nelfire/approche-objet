package fr.diginamic.fichier;

import java.util.ArrayList;

public class Ville {

	/** Code de la région */
	private String codeRegion;
	/** Nom de la région */
	private String nomRegion;
	/** Code du département */
	private String codeDepartement;
	/** Code de la commune */
	private String codeCommune;
	/** Nom de la commune */
	private String nomCommune;
	/** Population totale */
	private int population;

	/**
	 * Constructeur
	 * 
	 * @param codeRegion
	 * @param nomRegion
	 * @param codeDepartement
	 * @param codeCommune
	 * @param nomCommune
	 * @param populationTotale
	 */
	public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune,
			int population) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.population = population;
	}

	/**
	 * Getter
	 * 
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/**
	 * Setter
	 * 
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	/**
	 * Getter
	 * 
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**
	 * Setter
	 * 
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/**
	 * Getter
	 * 
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/**
	 * Setter
	 * 
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/**
	 * Getter
	 * 
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}

	/**
	 * Setter
	 * 
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	/**
	 * Getter
	 * 
	 * @return the nomCommune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/**
	 * Setter
	 * 
	 * @param nomCommune the nomCommune to set
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	/**
	 * Getter
	 * 
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * Setter
	 * 
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Ville: " + nomCommune + ", Population: " + population + "\n";
	}

	/**
	 * Afficher les informations villes en fonction du département passé en
	 * parametre
	 * 
	 * @param departement
	 */
	public void afficherVillesDuDepartement(String departement) {
		if (departement.equals(this.codeDepartement)) {
			System.out.println(toString());
		}
	}

	public static ArrayList<Ville> Rechercher10PlusGrandesVilles2(ArrayList<Ville> liste, String departement) {
		ArrayList<Ville> villesLesPlusGrandes = new ArrayList<>();

		for (int i = 0; i < liste.size(); i++) {

			if (villesLesPlusGrandes.size() <= 9) {
				villesLesPlusGrandes.add(liste.get(i));
			} else {
				for (int j = 0; j < villesLesPlusGrandes.size(); j++) {
					if (villesLesPlusGrandes.get(j).getPopulation() < liste.get(j).getPopulation()) {

						villesLesPlusGrandes.remove(j);
						villesLesPlusGrandes.add(liste.get(j));
					}
				}
			}

		}
		return villesLesPlusGrandes;
	}

	/**
	 * Retourne la liste des 10 plus grandes villes
	 * @param liste = la liste de villes
	 * @param departement = le département choisi
	 * @return
	 * @throws Exception = si le département passé en parametre n'est pas correctement formaté
	 */
	public static ArrayList<Ville> Rechercher10PlusGrandesVilles(ArrayList<Ville> liste, String departement) throws Exception {
		if(departement.length()>2 || departement.length()<2) {
			throw new Exception("Format du département incorrect !");
		}
		ArrayList<Ville> villesLesPlusGrandes = new ArrayList<Ville>();
		for (Ville villeCourante : liste) {
			if (villeCourante.getCodeDepartement().contentEquals(departement)) {
				if (villesLesPlusGrandes.size() < 10) {
					villesLesPlusGrandes.add(villeCourante);
				} else {
					Ville villePlusPetite = null;
					for (Ville vil : villesLesPlusGrandes) {
						if (villePlusPetite == null) {
							villePlusPetite = vil;
						} else {
							if (vil.getPopulation() < villePlusPetite.getPopulation()) {
								villePlusPetite = vil;
							}
						}
					}

					if (villePlusPetite.getPopulation() < villeCourante.getPopulation()) {
						villesLesPlusGrandes.remove(villePlusPetite);
						villesLesPlusGrandes.add(villeCourante);
					}
				}
			}

		}
		return villesLesPlusGrandes;
	}

}
