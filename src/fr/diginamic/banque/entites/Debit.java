package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOperation, int montantOperation) {
		super(dateOperation, montantOperation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String afficherType() {
		// TODO Auto-generated method stub
		return "Debit";
	}
	
	

}
