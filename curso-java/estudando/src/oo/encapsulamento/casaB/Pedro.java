package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{

	void testeAcesso() {
		
		//Ana mae = new Ana(); //instância
		
		//System.out.println(segredo); // não é acessado
		//System.out.println(facoDentroDeCasa); // é transmitido por herança se estiver dentro do mesmo pacote
		//System.out.println(mae.formaDeFalar); // transmitidos por herança e não precisa criar uma instância
		System.out.println(formaDeFalar); // recebeu por herança
		//System.out.println(mae.todosSabem);	// transmitidos por herança
		System.out.println(todosSabem);	// recebeu por herança
	}
}
