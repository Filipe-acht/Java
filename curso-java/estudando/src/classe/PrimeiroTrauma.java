package classe;

public class PrimeiroTrauma {

	/* int a = 3; // atributo que pertence à instância
	 * eu só consigo à partir de um método de classe, acessar um atributo de instância, se antes eu criar uma
	   instância, mesmo estando na mesma classe.
	*/
	//static int a = 3;
	int a = 3;
	
	public static void main(String[] args) {
		// método static -> método que pertence à classe
		
		//System.out.println(a);

		PrimeiroTrauma p = new PrimeiroTrauma();// criando uma instância
		System.out.println(p.a);
	}
}
