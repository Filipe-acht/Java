package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56; //inferencia
		double y = 2.2;
		
		// o resultado de um operação com double será um double
		System.out.println(x + y); // soma 
		System.out.println(x - y); // subtração
		System.out.println(x * y); // multiplicação
		System.out.println(x / y); // divisão 
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b); // soma 
		System.out.println(a - b); // subtração
		System.out.println(a * b); // multiplicação
		System.out.println(a / b); // divisão
		System.out.println(a / (double) b); // conversão com CAST
		System.out.println(a / (float) b); // conversão com CAST
		
		// Operador Módulo
		System.out.println(a % b);
		
		System.out.println(x + y - a * b);
	}
}
