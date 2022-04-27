package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5; // O java vai inferir no tipo da variavel pelo valor colocado(no caso: double).
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		//c =  4.5;// O Java nao vai permitir, pois a variavel(c) esta amarrada para um tipo string

		double d;
		d = 123.65;
		System.out.println(d);
				
	}
}
