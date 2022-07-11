package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		// FIFO -> first in / first out  
		Queue<String> fila = new LinkedList<>();
		/*
		 * Caso a fila tenha um tamanho predefinido:
		   ** add -> gera um erro, caso nao consiga adicionar
		   ** offer -> retorna falso, " " " 
		*/
		
		// Offer e Add -> adicionam elementos na fila
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		
		// Peek e Element -> obter o próximo elemento da fila(sem remover)
		System.out.println(fila.peek()); // retorna null quando vazia
		System.out.println(fila.element()); // lança uma exceção
		
				
		// poll -> quando lista vazia retorna null
		// remove -> quando lista vazia lança uma exceção
		System.out.println(fila.poll()); //retorna o primeiro elemento da fila já removendo
		System.out.println(fila.remove()); //remove da lista
		
		//fila.size(); -> tamanho
		//fila.clear(); -> limpar a fila
		//fila.isEmpty(); -> verificar se a fila esta ou não vazia
		//fila.contains(...); -> se contem
		//...
	}
}
