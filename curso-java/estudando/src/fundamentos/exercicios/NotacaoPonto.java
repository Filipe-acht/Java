package fundamentos.exercicios;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X";
		s = s.toUpperCase(); // String convertida toda para maiuscula
		
		s = s.replace("X", "Senhora"); // A ordem influencia no resultado(BOM DIA Senhora)
		s = s.concat("!!!");
		System.out.println(s);
		
		String x = "Filipe".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Filipe").toUpperCase().concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		int  z = 3;
		System.out.println(z);
	}
}
