package fundamentos.exercicios;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		
		// F = (C * 1.8) + 32
		double fat1 = 32;
		double fat2 = 1.8;
		double celsius = 40.5;
		
		double fahrenheit = (celsius * fat2) + fat1;
		
		System.out.printf("Celsius para Fahrenheit = %.2f", fahrenheit);
	}
}
