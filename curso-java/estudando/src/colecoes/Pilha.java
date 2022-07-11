package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		// LIFO -> last in / first out
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Principe");// se adicionar retorna true/false
		livros.push("Don Quixote"); //lança uma exception caso não consiga adicionar
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for (String livro : livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.pop());
		//System.out.println(livros.remove());
		
		
		//livros.size(); 
		//livros.clear(); 
		//livros.isEmpty(); 
		//livros.contains(...);
		//...
	}
	
}
