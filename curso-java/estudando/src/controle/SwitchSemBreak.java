package controle;

public class SwitchSemBreak {
    
    public static void main(String[] args) {
        
        String faixa = "verde";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Bassai-Dai..");
            case "marrom":
                System.out.println("Tekki Shodan");
            case "roxa":
                System.out.println("Heian Godan");
            case "verde":
                System.out.println("Heian Yodan");
            case "laranja":
                System.out.println("Heian sandan");
            case "vermelha":
                System.out.println("Heian Nidan");
            case "amarela":
                System.out.println("Heian Shodan");
                //break;
            // default:
            //     System.out.println("Nao sei nada");
        }
    }
}
