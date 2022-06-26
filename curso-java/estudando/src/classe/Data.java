package classe;

public class Data {
	
	String dia;
	String mes;
	String ano;
	
	int dia2;
	int mes2;
	int ano2;

	String dataFormatada(){
		return String.format("%d/%d/%d", dia2, mes2, ano2);
	}
	
	String dataFormatada2(){
		return String.format("%s/%s/%s", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.printf("%s/%s/%s", dia, mes, ano);
	}
}
