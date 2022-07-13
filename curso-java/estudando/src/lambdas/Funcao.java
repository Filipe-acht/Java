package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		// função recebe dois parametros Function<Tipo, Retorno>
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar"; // ternario

		Function<String, String> oResultadoE = valor -> "O resultado e: " + valor;

		Function<String, String> empolgado = valor -> valor + "!!!";

		Function<String, String> duvida = valor -> valor + "???";

		String resultadoFinal = parOuImpar.andThen(oResultadoE) // e então -> chamar outra função
				.andThen(empolgado).apply(32);

		String resultadoFina2 = parOuImpar.andThen(oResultadoE) // e então -> chamar outra função
				.andThen(duvida).apply(33);

		System.out.println(resultadoFinal);
		System.out.println(parOuImpar.apply(32));
		System.out.println(resultadoFina2);
	}
}
