package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
				//(Double n1, Double n2) -> (n1 + n2) / 2; //outra forma
		System.out.println("\nBinaryOperator: ");
		System.out.println(media.apply(9.8, 5.7));
		
		// pra retornar o status do aluno
		// receber dois numeros e retornar uma String
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		System.out.println("\nBiFunction: ");
		System.out.println(resultado.apply(9.7, 5.1));
		
		Function<Double, String> conceito = 
				m -> m >= 7 ? "Aprovado" : "Reprovado";
				
		System.out.println("\nUsando a composicao");
		System.out.println(media.andThen(conceito).apply(9.7, 5.1));
	}
}
