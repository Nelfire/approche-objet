package fr.diginamic.banque.entites;

public abstract class Operation {
	

	/** dateOperation */
	private String dateOperation;
	
	/** montantOperation */
	private int montantOperation;
	
	/**
	 * @param dateOperation
	 * @param montantOperation
	 */
	public Operation(String dateOperation, int montantOperation) {
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}

	
	/**
	 * @return Récupérer date de l'opération
	 */
	public String getDateOperation() {
		return dateOperation;
	}

	/**
	 * @param Définir date de l'operation
	 */
	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	/**
	 * @return Récupérer le montant de l'opération
	 */
	public int getMontantOperation() {
		return montantOperation;
	}

	/**
	 * @param Définir le montant de l'opération
	 */
	public void setMontantOperation(int montantOperation) {
		this.montantOperation = montantOperation;
	}


	@Override
	public String toString() {
		return "DateOperation : " + dateOperation + ", Montant Opération : " + montantOperation +", ";
	}

	/** Cette méthode retourne le type de l'opération , débit ou crédit
	 * @return String
	 */
	public abstract String afficherType();
	
	
	

}
