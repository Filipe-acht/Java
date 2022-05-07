package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		// Area =  base * altura / 2
		Scanner valores = new Scanner(System.in);
		System.out.println("Informe a base do triangulo: ");
		double base = valores.nextDouble();
		
		System.out.println("Informe a altura do triangulo: ");
		double altura = valores.nextDouble();
		
		
		double area =  (base * altura) / 2;
		
		System.out.printf("Area = %.2f * %.2f / 2 = %.2f",
								 base, altura, area);
	}
}
