package fr.diginamic.banque.entites;

public class Client {

	private String nomClient;
	private String prenomClient;
	
	/** Constructeur
	 * @param nomClient
	 * @param prenomClient
	 */
	public Client(String nomClient, String prenomClient) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
	}

	/** Getter
	 * @return the nomClient
	 */
	public String getNomClient() {
		return nomClient;
	}

	/** Setter
	 * @param nomClient the nomClient to set
	 */
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	/** Getter
	 * @return the prenomClient
	 */
	public String getPrenomClient() {
		return prenomClient;
	}

	/** Setter
	 * @param prenomClient the prenomClient to set
	 */
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	
	@Override
	public String toString() {
		return "Nom : " + nomClient + ", Prenom : " + prenomClient;
	}
	
	
	
	
}
