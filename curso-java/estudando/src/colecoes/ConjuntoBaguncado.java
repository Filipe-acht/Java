package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" }) // silenciando as advertências
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		// converte automaticamente para uma classe
		// adicionando elemento a collection
		conjunto.add(1.2); // duble -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho e " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste")); // se remover algo retorna true, se não false.
		
		System.out.println("Tamanho e " + conjunto.size());
		
		
		System.out.println(conjunto.contains("Teste")); // verifica se contém tal elemento
		
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // fazendo União entre dois conjuntos
		conjunto.retainAll(nums); // fazendo interseção
		System.out.println(conjunto);

	}
}
