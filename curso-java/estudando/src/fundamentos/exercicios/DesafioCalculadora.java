package fundamentos.exercicios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		//numero1 e numero2
		// qual é a operação
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro numero: ");
		//String numero1 = entrada.nextLine();
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite seu segundo numero: ");
		//String numero2 = entrada.nextLine();
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe o sinal de operacao: ");
		String sinal = entrada.next();
		
		// Lógica do cálculo com operador ternário
		double resultado = "+".equals(sinal) ? num1 + num2 : 0;
			   resultado = "-".equals(sinal) ? num1 - num2 : resultado;
			   resultado = "*".equals(sinal) ? num1 * num2 : resultado;
			   resultado = "/".equals(sinal) ? num1 / num2 : resultado;
			   resultado = "%".equals(sinal) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				num1, sinal, num2, resultado);		
		
		entrada.close();
	}
}
