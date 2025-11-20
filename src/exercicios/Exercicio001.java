package exercicios;

import java.util.Locale;

public class Exercicio001 {

	public static void main(String[] args) {
		// Produza a seguinte saída na tela do console:
		
		/*	Products:
			Computer, which price is $ 2100,00
			Office desk, which price is $ 650,50
			
			Record: 30 years old, code 5290 and gender: F
			
			Measue with eight decimal places: 53,23456700
			Rouded (three decimal places): 53,235
			US decimal point: 53.235
		*/
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		double priceProduct1 = 2100.00;
		double priceProduct2 = 650.00;
		double measure = 53.234567;
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f\n", product1, priceProduct1);
		System.out.printf("%s, which price is $ %.2f\n", product2, priceProduct2);
		System.out.println();
		
		System.out.printf("Record: %d years old, code %d and gender: %c\n", age, code, gender);
		System.out.println();
		
		System.out.printf("Measure with eight decimal places: %.8f\n", measure);
		System.out.printf("Rouded (three decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f\n", measure);
		
	}

}
