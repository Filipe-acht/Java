package arrays;

import java.util.Scanner;

public class Desafio {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas: ");

        int qtdNotas = entrada.nextInt();
        //System.out.println(qtdNotas);

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }
        
        double total = 0;
        //foreach
        for (double nota : notas) {
            total += nota;           
        }

        double media = total / notas.length;
        System.out.println(" A media e " + media + "!");
        entrada.close();
    }
}
