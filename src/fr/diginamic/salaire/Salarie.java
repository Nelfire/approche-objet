package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	/** a un attribut d’instance : le montant du salaire mensuel */
	double salaireMensuel;
	
	/** Constructeur
	 * @param salaireMensuel
	 */
	
	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return salaireMensuel;
	}

	
	/** Getter
	 * @return Retourne le status
	 */
	public String getStatus() {
		return "Salarié";
	}

}
