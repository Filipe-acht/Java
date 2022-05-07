package fundamentos;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// IMC = peso / (altura²)
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu peso: ");
		//double peso = entrada.nextDouble();
		String peso1 = entrada.nextLine().replace(",",".");
		
		double peso2 = Double.parseDouble(peso1);
		
		System.out.println("Informe sua altura em (cm): ");
		double altura = entrada.nextDouble();
		
		double imc = peso2 / Math.pow(altura, 2);
		//double imc = peso2 /(altura * altura);
		
		System.out.printf("Peso = %.2f, Altura = %.2f", peso2, altura);
		System.out.printf("\nO seu IMC e: %f", imc);
		
		entrada.close();
		
	}
}
