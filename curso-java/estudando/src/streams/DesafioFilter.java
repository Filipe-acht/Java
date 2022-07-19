package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 6893.89, 0.35, 0);
		Produto p2 = new Produto("Lapis", 1.89, 0, 0);
		Produto p3 = new Produto("Cadeira Gamer", 1270.89, 0.25, 0);
		Produto p4 = new Produto("Impressora", 1200.69, 0.40, 0);
		Produto p5 = new Produto("iPad", 3100.79, 0.45, 40);
		Produto p6 = new Produto("Relogio", 1846.29, 0.12, 0);
		Produto p7 = new Produto("Monitor", 798.23, 0.35, 60);
		
		
		List<Produto> produtos = 
				Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		// Filter, filter, map
		Predicate<Produto> superPromocao = 
				p -> p.desconto >= 0.3;
		Predicate<Produto> freteGratis = 
				p -> p.frete == 0;
		Predicate<Produto> precoRelevante = 
				p -> p.preco >= 500;
		Function<Produto, String> chamadaPromocional = 
				p -> "Aproveite! " + p.nome + " por R$" + p.preco;
				
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(precoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);
	}
}
