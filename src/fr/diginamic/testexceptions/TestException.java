package fr.diginamic.testexceptions;

public class TestException {

	public static void main(String[] args) {
		
		try {
			System.out.println(Operation.diviser(10, 0));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

		
	}

}
