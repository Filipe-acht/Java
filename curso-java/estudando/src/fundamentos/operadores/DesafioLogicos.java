package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		// Trabalho na terça( V ou F)
		// Trabalho na quinta(V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operdor Unário
		boolean maisSaudavel = !comprouSorvete;
		
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais saudavel? " + maisSaudavel);
	}

}