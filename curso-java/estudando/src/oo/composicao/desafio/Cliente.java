package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nome;
	// um cliente tem muitas compras, uma compra pertence a um cliente
	final List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double getValorTotal() {
		double total = 0;
		
		for (Compra compra : compras) {
			total += compra.getValorTotal();
		}
		
		return total;
	}
}
