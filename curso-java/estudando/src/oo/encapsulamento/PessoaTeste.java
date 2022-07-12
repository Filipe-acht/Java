package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Filipe", "Nascimento", -22);
		//p1.idade = -30; // alterar o valor da variavel
		//p1.setIdade(-22); // considera a validação
		
		System.out.println(p1.getIdade()); // ler o valor 
		System.out.println(p1); // toString 
		System.out.println("Nome completo: " + p1.getNomeCompleto()); 
	}
}
