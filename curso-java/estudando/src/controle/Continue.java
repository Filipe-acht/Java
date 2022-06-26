package controle;

public class Continue {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            if( i % 2 == 1){
                continue; // interrompe apenas a repetição/iteração
            }
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i++) {
            if( i == 5){
                continue; // interrompe apenas a repetição/iteração
            }
            System.out.println(i);
        }
    }
}
