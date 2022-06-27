package classe;

public class Produto {
    
    String nome; // nome do produto
    double preco; // preço do produto
    //double desconto; // desconto para o produto 
    static double desconto = 0.25;

    // Construtor implicito - padrão
    Produto(){
    	
    }    
    
    Produto(String nomeInicial, double precoInicial/*,
    	    double descontoInicial*/){
    	nome = nomeInicial;
    	preco = precoInicial;
    	/*desconto = descontoInicial;*/
    }
    
    
    //Método desconto
    double precoComDesconto(){ // não é necessário passar os parametros, pois o objeto já possui esses dados
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente){ // recebe um parametro
        return preco * (1 - desconto + descontoDoGerente);
    }

    /*
    //Construtor explicito
    Produto(String nomeInicial){
        nome = nomeInicial;
    }
    
    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }*/
}
