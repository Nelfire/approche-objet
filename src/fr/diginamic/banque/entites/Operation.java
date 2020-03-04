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
	 * @return R�cup�rer date de l'op�ration
	 */
	public String getDateOperation() {
		return dateOperation;
	}

	/**
	 * @param D�finir date de l'operation
	 */
	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	/**
	 * @return R�cup�rer le montant de l'op�ration
	 */
	public int getMontantOperation() {
		return montantOperation;
	}

	/**
	 * @param D�finir le montant de l'op�ration
	 */
	public void setMontantOperation(int montantOperation) {
		this.montantOperation = montantOperation;
	}


	@Override
	public String toString() {
		return "DateOperation : " + dateOperation + ", Montant Op�ration : " + montantOperation +", ";
	}

	/** Cette m�thode retourne le type de l'op�ration , d�bit ou cr�dit
	 * @return String
	 */
	public abstract String afficherType();
	
	
	

}
