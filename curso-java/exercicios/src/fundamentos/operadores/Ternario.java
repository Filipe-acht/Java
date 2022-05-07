package fundamentos.operadores;



public class Ternario {
	
	public static void main(String[] args) {
		
		double media =  5.6;
		
		String resultadoFinal = media >= 7.0 ? 
				"aprovado." : "em recuperacao.";
		
		System.out.println("O aluno esta " + resultadoFinal);
		
		double nota = 7.3;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Nao.";
		
		//System.out.println("Tem desconto? " + resultado);
		System.out.printf("Tem desconto? %s", resultado);
	}

}
