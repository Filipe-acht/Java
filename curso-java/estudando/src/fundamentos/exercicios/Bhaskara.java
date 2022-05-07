package fundamentos.exercicios;

public class Bhaskara {
	
	public static void main(String[] args) {
		
		// (ax2 + bx + c = 0)	
		// a = 1, b = 12 e c = -13
		// Delta = b² - 4ac
		
		double a = 1;
		double b = 12;
		double c = -13;
		
		System.out.printf("A equacao: %.1fx2 + %.1fx + %.1f = 0 ", a, b, c);
		System.out.printf("\nO calculo do delta: b2 - 4 * a * c");
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		System.out.println("\nO valor do delta e: " + delta);
		
	}

}
