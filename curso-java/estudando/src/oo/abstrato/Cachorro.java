package oo.abstrato;

public class Cachorro extends Mamifero{

	/*
	 * Sendo Cachorro uma classe concreta, preciso implementar(obrigatoriamente),
	 todos os metodos abstratos.
	 */
	/*@Override
	public String mamar() {
		return null;
	}*/
	
	@Override
	public String mover() {
		return "Usando as patas";
	}
	
	@Override
	public String mamar() {
		return "Usando leite";
	}
}
