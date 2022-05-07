package fundamentos.conversoes;

import javax.swing.JOptionPane;

public class ConversaoString {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog( // janelinha
				"Digite o primeiro numero: ");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo numero: ");
		
		System.out.println(valor1 + valor2);// concatenação
		
		// Convertendo String para number
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma eh: " + soma);
		System.out.println("Media eh: " + soma / 2);
		

		
	}

}
