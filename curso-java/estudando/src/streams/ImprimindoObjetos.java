package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Lu", "Gui", "Lily", "Hans");

		System.out.println("Imprimindo usando o foreach..");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nImprimindo usando o Iterator..");
		Iterator<String> iterator/* variavel */ = aprovados.iterator();
		while (iterator.hasNext()) {// tem próximo?
			System.out.println(iterator.next()); // imprime o próximo
		}

		System.out.println("\nImprimindo usando Stream..");
		Stream<String> stream /* variavel */ = aprovados.stream();
		stream.forEach(System.out::println); // Laço interno
	}
}
