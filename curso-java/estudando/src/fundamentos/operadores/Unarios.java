package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		//posfix
		a++; // (a = a + 1) - Incrementando ao valor da variavel
		a--; // (a = a - 1) - Decrementando
		
		//prefix
		++b;
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // só vai decrementar do b após a comparação
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
