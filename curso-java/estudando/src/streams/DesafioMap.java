package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		/*
		 * 1. Numero para string binária ... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
		
		// 2
		UnaryOperator<String> inverter =
				s -> new StringBuilder(s).reverse().toString(); // StringBuilder -> class usada para manipular strings
		
		// 3
		Function<String, Integer> binarioParaInt = 
				s -> Integer.parseInt(s, 2); /* colocando 2, ele vai entender que está sendo passada uma string binaria, 
											e converte-la para um valor inteiro */
		nums.stream() /* build operation */
			/* intermediate operation */
			.map(Integer::toBinaryString) // 1
			.map(inverter)
			.map(binarioParaInt)
			/* terminal operation */
			.forEach(System.out::println); 
		
	}
}
