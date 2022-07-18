package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print; // imprime só strings
		Consumer<Integer> println = System.out::println; // imprime inteiros
		// Consumer<Object> print = System.out::print; // qualquer tipo

		// criando uma stream - usando stream.of()
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);

		// criando uma stream a partir de um array
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };

		Stream.of(maisLangs).forEach(print);

		// criando uma stream a partir de Arrays.stream()
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print);// passando index

		// criando uma stream a partir de collections
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);

		// criando uma stream usando o método generate()
		// Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(println);
	}
}
