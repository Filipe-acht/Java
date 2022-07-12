package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;	
	
	// construtor
	public Pessoa(String nome, String sobrenome, int idade) {
		//this.idade = idade;
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade); // verifica se a idade é valida
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	// lendo uma variavel private
	// Getter
	public int getIdade() {
		return idade;
	}
	
	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	@Override
	public String toString() {
		return "Hallo, ich bin " + getNome() + " " + getSobrenome() 
			+ " und " + getIdade() + " jahre alt.";
	}
}
