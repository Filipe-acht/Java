package classe;

public class ProdutoTeste {
    
    public static void main(String[] args) {
        
    	
        Produto /*Tipo*/ p1 = new Produto("Notebook", 4356.89); /* new -> chamar o construtor */
        //Criando instância
        //p1.nome = "Notebook"; /* notação ponto para acessar os membros que pertencem à instância*/
        //p1.preco = 4356.89;
        //p1.desconto = 0.25;

        var p2 = new Produto(); // faz a inferência e o p2 será do tipo Produto
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        Produto.desconto = 0.5;
        
        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());
        
        /*double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.preco * (1 - p2.desconto);*/
        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        
        double mediaCarrinho = (precoFinal1 + precoFinal2)/ 2;
        
        System.out.printf("Media do carrinho = R$%.2f.", mediaCarrinho);
    }
}
