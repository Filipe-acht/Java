package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Classic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		// Carro ferrari = new Ferrari(400);
		Ferrari ferrari = new Ferrari(400);
		// ferrari.nome = "Veneno";

		Carro classic = new Classic();

		System.out.println(classic);
		System.out.println(ferrari);
		ferrari.acelerar();
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		classic.acelerar();

		System.out.println(classic);
		System.out.println(ferrari);
		ferrari.acelerar();
		//ferrari.desligarTurbo();
		classic.acelerar();

		System.out.println(classic);
		System.out.println(ferrari);
		ferrari.acelerar();
		classic.acelerar();

		System.out.println(classic);
		System.out.println(ferrari);

		ferrari.frear();
		classic.frear();

		System.out.println(classic);
		System.out.println(ferrari);
		System.out.println("Velocidade ar-condicionado " + ferrari.velocidadeDoAr());
	}
}
