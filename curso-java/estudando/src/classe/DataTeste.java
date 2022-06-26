package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = "21";
		d1.mes = "06";
		d1.ano = "2000";
				
		/*System.out.printf("Data e: %s/%s/%s\n", d1.dia,
											  d1.mes,
											  d1.ano);*/
		d1.imprimirDataFormatada();
		System.out.println(d1.dataFormatada2());
		
		var d2 = new Data();
		d2.dia2 = 21;
		d2.mes2 = 06;
		d2.ano2 = 2000;
		
		System.out.println(d2.dataFormatada());
		/*System.out.printf("Data2 e: %d/%d/%d", d2.dia2,
											   d2.mes2,
											   d2.ano2);*/
		
		
	}

}
