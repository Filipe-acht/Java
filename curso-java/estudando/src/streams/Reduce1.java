package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		// reduce é também uma função terminal
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		BinaryOperator<Integer> soma = (ac, n) -> ac + n; // função acumuladora para o reduce

		Integer total1 = nums.parallelStream().reduce(soma).get(); // usa o get, quando recebe um optional de Integer
		System.out.println(total1);

		Integer total2 = nums.stream().reduce(100, soma); // valor inicial chamado de forma parallelStream()
		System.out.println(total2);

		// Resultado foi um Opcional<Integer>...
		nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);// se presente, faça alguma
																						// coisa...
	}
}
