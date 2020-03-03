package utils;


public class ConversionNombre {

	public static void main(String[] args) {
		// Variable
		String var1 = "1";		
		int a = 15;
		int b = 122;
		
		//Transformer string en int
		int var2 = Integer.parseInt(var1);
		

		//Comparer deux variables et récupérer le max
		System.out.println(Integer.max(a, b));

	}

}
