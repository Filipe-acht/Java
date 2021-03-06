package fundamentos.tipos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ola Leute".charAt(5));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Filipe";
		var sobrenome = "Soares";
		var salario = 3_536.99;
		// var idade  = 21;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nSalario " + salario);
		System.out.printf("\nO senhor %s %s ganha R$ %.2f.", nome,
				sobrenome, salario);
		
		String frase = String.format("\nO senhor %s %s ganha R$ %.2f.", nome,
				sobrenome, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("quale"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		
	}
}
