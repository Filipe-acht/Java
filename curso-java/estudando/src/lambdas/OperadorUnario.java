package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		/* 
		 * Unary Operator -> muito simples pra fazer encadeamento de varias chamadas
		 					 porque o tipo de parametro que é passado como entrada,
		 					 é também o tipo de retorno gerado.
		 */
		
		UnaryOperator<Integer> maisDois = n -> n + 2;		
		UnaryOperator<Integer> vezesDois = n -> n * 2;		
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		// antThen -> usado para fazer composição de função
		int  resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		
		System.out.println("Resultado 1 => " + resultado1);
		
		// compose -> também usado para fazer composição de função
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		
		System.out.println("Resultado 2 => " + resultado2);
	}
}
