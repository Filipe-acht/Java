package oo.composicao.desafio;

public class Item {

	// item tem uma relação com produto
	final Produto produto;
	final int quantidade;
	
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}	
}
