package controle;

import java.util.Scanner;

public class DoWhile {
    
    public static void main(String[] args) {
        
        // if(...) sentenca unica; ou {}
        // while(...) sentenca unica; ou {}
        // for(..; ...; ..) sentenca unica; ou {}
        // do sentenca unica; ou {} while(...); -> instrução depois do bloco

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisar falar " 
                             + "\nas palavras magicas...");
            System.out.println("Quer sair? ");
            texto = entrada.nextLine();
        } while(!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");
        entrada.close();

    }
}
