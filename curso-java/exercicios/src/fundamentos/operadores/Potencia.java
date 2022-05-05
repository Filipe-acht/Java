package fundamentos.operadores;

public class Potencia {

	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); // devo usar um CAST, caso queira um resultado inteiro
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		
	}
}
