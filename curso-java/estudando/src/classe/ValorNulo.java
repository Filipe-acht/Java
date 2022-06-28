package classe;

public class ValorNulo{
    /*
     * Erro de runtime:
     * NullPointerException -> quando temos uma variável nula e 
       tentamos acessar alguma método ou atributo dessa variável
     */
    public static void main(String[] args){

        String s1 = "";
        System.out.println(s1.concat("!!!!"));

        //Data2 d1 = null;
        Data2 d1 = Math.random()> 0.5 ? new Data2() : null;

        if(d1 != null){
            d1.mes = 3;
            System.out.println(d1.dataFormatada());
        }
    }
}