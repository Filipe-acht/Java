package oo.heranca.desafio;

public interface Luxo {

	public void ligarAr();
	abstract void desligarAr();
	
	// implementação padrão, caso eu não queira forçar a implementação do metodo
	default int velocidadeDoAr() {
		return 1;
	}
}
