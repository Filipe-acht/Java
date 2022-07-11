package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	// compra tem uma lista de itens
	final List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}
	
	// automaticamente cria um produto, cria um item e já adiciona o item aos itens dessa compra
	void adicionarItem(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}
	
	
	
	double getValorTotal() {
		double total = 0;
		
		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
