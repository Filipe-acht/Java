package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoCubo {
	
	public static void main(String[] args) {
		
		Scanner lendo = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		double valor = lendo.nextDouble();
		
		/** Existe tambem a seguinte possibilidade
		 * double quadrado = valor * valor;
		 * double cubo = valor * valor * valor;
		 */
		
		double quadrado = Math.pow(valor, 2);
		double cubo 	= Math.pow(valor, 3);
		
		System.out.println("O quadrado do valor informado: " + quadrado + " e o cubo: " + cubo);
		//System.out.println("O cubo do valor informado: " + cubo);		
		
		lendo.close();
	}

}
