package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		// lambda: 
		Calculo calc = (x, y) -> { return x + y; };
		System.out.println(calc.executar(2, 3));
		
		// implementando a multiplicação
		calc = (x, y) -> x * y; // quando não é colocado o par de chaves, automaticamete a expressão será o retorno.
		System.out.println(calc.executar(2, 3));
	}
}
