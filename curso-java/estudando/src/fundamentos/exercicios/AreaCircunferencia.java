package fundamentos.exercicios;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4; // nm_variavel, tipo e valor
		final double PI = 3.14159; // uma vez que eu tenho um valor ele não poderá ser alterado(final: constante)
		
		// formula que calcula a area da circunferencia
		double area = PI * raio * raio;		
		System.out.println(area);
		
		raio = 10;
		area =  PI * raio * raio;
		
		System.out.println("Area = "+ area + "m2"); // + concatenação
	}

}
