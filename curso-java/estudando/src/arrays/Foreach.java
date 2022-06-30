package arrays;

public class Foreach {
    
    public static void main(String[] args) {
        
        double[] notas = { 9.9, 8.7, 7.2, 9.4 };

        // foreach -> sair do primeiro e ir percorrendo até o último, passando por todos
        for( double nota: notas) {
            System.out.println(nota);
        }
        System.out.println();

        for(int i = 0; i <  notas.length; i++) {
            System.out.println(notas[i] + " ");
        }
    }
}
