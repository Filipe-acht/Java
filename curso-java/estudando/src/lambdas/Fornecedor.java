package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
		
		// não recebe nenhum parametro e retorna alguma coisa
		// uma lista de Strings sendo passada como tipo de retorno do Supplier
		Supplier<List<String>> umaLista =
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
				System.out.println(umaLista.get());
	}
}
