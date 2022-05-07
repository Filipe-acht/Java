package fundamentos.exercicios;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		
		// c= 5/9 . ( F - 32)
		double fat1 = 32;
		double fat2 = 5.0 / 9.0;
		
		double farenh  = 132.89;
		
		double celsius  = fat2 * (farenh - fat1);
		
		System.out.printf("Farenheit para Celsius = %.2f", celsius);
		
	}
}
