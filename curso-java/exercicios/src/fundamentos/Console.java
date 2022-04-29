package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		

		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); // print formatado
		
		System.out.printf("Salario: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Filipe");
		
		Scanner entrada  = new Scanner(System.in);//out é a tela
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine(); // o programa vai ficar esperando algo ser digitado
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine(); // o programa vai ficar esperando algo ser digitado
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt(); // o programa vai ficar esperando algo ser digitado
		
		//System.out.println("\n\nNome = " + nome + " " + sobrenome);
		System.out.printf("%s %s tem %d anos. %n", nome, sobrenome, idade);
		
		/* Uma vez que o scanner não for mais usado, é recomedavel fecha-lo, pois estará ocupando recursos da máquina*/
		
		entrada.close();
	}

}
