package br.com.lily.cm;

import br.com.lily.cm.modelo.Tabuleiro;
import br.com.lily.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}

}
