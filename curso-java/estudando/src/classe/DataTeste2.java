package classe;

public class DataTeste2 {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		//d1.ano = "2000";
				
		/*System.out.printf("Data e: %s/%s/%s\n", d1.dia,
											  d1.mes,
											  d1.ano);*/
		//d1.imprimirDataFormatada();
		System.out.println(d1.dataFormatada2());
		
		var d2 = new Data(1, 1, 1995);
		
		System.out.println(d2.dataFormatada());
	}

}
