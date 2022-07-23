package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (RuntimeException e) { //Exception -  genérico
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	// Não checada ou não verificada
	static void geraErro1() {
		//throw - lançar (para lançar o erro)
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}
	
	/* 
	 * Exceção checada ou verificada: é obrigatório colocar na assinatura do método
	   que eu lanço esse tipo de exceção usando throws Exception
	 */
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02");
	}
}
