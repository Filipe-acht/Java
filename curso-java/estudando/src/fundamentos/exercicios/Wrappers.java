package fundamentos.exercicios;

//import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		// Wrapper é uma classe que dentro dela envolve um tipo primitivo
		// um literal sempre será um primitivo
		// Scanner entrada = new Scanner(System.in);

		Byte b = 1; // byte
		Short s = 1000; // short

		Integer i = 10000; // int
		// Integer i = Integer.parseInt("1000"); // convertendo uma String para um
		// inteiro
		// Integer i = Integer.parseInt(entrada.next()); // vai pegar uma String

		// l para primitivo e L para Class
		Long l = 100000L;// long só converte de long para long(L)

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		//float
		Float f = 123.10F;
		System.out.println(f);

		//double 
		Double d = 12345.76234;
		System.out.println(d);
		
		// boolean
		Boolean bo = Boolean.parseBoolean("true"); // convertendo string para um valor booleano
		System.out.println(bo);
		// System.out.println(bo.toString().toUpperCase());

		Character c = '#'; // char
		System.out.println(c + "...");

		// entrada.close();
	}

}
