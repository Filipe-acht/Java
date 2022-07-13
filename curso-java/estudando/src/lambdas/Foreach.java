package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays
				.asList("Ana", "Bia", "Lia", "Gui");
		System.out.println("Forma tradicional...");
		for (String nome: aprovados) {
			System.out.println(nome);
		}
		// percorrer usando lambda
		System.out.println("\nLambda #01...");
		//aprovados.forEach((nome) -> { System.out.println(nome + "!!!"); }); // passar uma exoressão lambda como parametro
		aprovados.forEach(nome -> System.out.println(nome + "!!!")); // se tiver um unico parametro
		
		System.out.println("\nMethod Reference(::) #01...");
		// navegando em cima de cada um dos nomes e passar esse nome como parametro para a função println
		/*
		 * Para cada nome que estiver dentro da lista dos aprovados, imprima na saida do sistema.
		 */
		aprovados.forEach(System.out::println); 
		
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> meuImprimir(nome)); // se tiver um unico parametro
		
		System.out.println("\nMethod Reference(::) #02...");
		aprovados.forEach(Foreach::meuImprimir); 
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Hallo, Mein name ist " + nome);
	}
}
