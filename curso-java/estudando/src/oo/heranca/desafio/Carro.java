package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	private int delta = 5;

	// Problema1: fazendo isso a classe pai deixa de ter um construtor padrão
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	// metodo acelerar
	public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}
	}

	// metodo frear
	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

	public String toString() {
		return "Velocidade atual e " + velocidadeAtual + " Km/h.";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	/*
	 * String nome; int vel_atual = 0;
	 * 
	 * boolean acelerar() { if(vel_atual >= 0) { vel_atual += 5; return true; } else
	 * { return false; } }
	 * 
	 * boolean frear() { if(vel_atual > 0) { vel_atual = vel_atual - 5; return true;
	 * } else { return false; }
	 * 
	 * }
	 */
}
