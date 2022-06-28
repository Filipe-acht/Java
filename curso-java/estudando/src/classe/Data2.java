package classe;

public class Data2 {
    
	int dia;
	int mes;
	int ano;

	// Construtor padrão
	Data2 (){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
        // usando como método
        this(1, 1, 1970);// usar o this pra chamar a partir de um construtor, chamar outro construtor.
	} 
	
	// Construtor explicito
    // sempre que eu quiser acessar uma variável que pertence à instância: eu uso o this.nomeVariavel
    // aponta para o objeto atual 
	Data2(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String dataFormatada(){
        final String formato = "%d/%d/%d"; // variável/constante local - definir um valor dentro de um método
		return String.format(formato, dia, mes, ano);
	}
	void imprimirDataFormatada() {
		System.out.printf("%s/%s/%s", dia, mes, ano);
	}

    //String formato = "%d/%d/%d"; // variável pertence à instância e pode ser usada em qualquer método de instância
}
