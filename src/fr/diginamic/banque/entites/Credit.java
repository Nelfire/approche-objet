package fr.diginamic.banque.entites;

public class Credit extends Operation {

	
	public Credit(String dateOperation, int montantOperation) {
		super(dateOperation, montantOperation);
		
	}

	@Override
	public String afficherType() {
		// TODO Auto-generated method stub
		return "Credit";
	}
	
	
}
