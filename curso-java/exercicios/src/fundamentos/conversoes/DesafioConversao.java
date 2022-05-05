package fundamentos.conversoes;

//import java.util.Locale;
import java.util.Scanner;


public class DesafioConversao {

	public static void main(String[] args) {
		
		//Locale.setDefault(new Locale("pt", "BR")); // para correção da exceção InputMismatchException
		
		Scanner entrada =  new Scanner(System.in);
		
		// pode ser next(pegando apenas uma unica palavra) ou nextline(pegando a linha inteira)
		System.out.println("Digite seu primeiro ultimo salario: ");
		String sal1 = entrada.nextLine().replace(",","."); // .replcace para substituir a virgula pelo ponto
		
		System.out.println("Digite seu segundo ultimo salario: ");
		String sal2 = entrada.nextLine().replace(",",".");
		
		System.out.println("Digite seu terceiro ultimo salario: ");
		String  sal3 = entrada.nextLine().replace(",",".");
		
		double salario1 = Double.parseDouble(sal1);
		double salario2 = Double.parseDouble(sal2);
		double salario3 = Double.parseDouble(sal3);
		
		double soma = salario1 + salario2 + salario3;
		
		double media = soma / 3;
		
		System.out.println("A media eh : " + media);
		
		entrada.close();
	}
}
