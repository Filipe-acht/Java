package classe;

public class Produto {
    
    String nome; // nome do produto
    double preco; // preço do produto
    double desconto; // desconto para o produto 

    //Método desconto
    double precoComDesconto(){ // não é necessário passar os parametros, pois o objeto já possui esses dados
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente){ // recebe um parametro
        return preco * (1 - desconto + descontoDoGerente);
    }
}
