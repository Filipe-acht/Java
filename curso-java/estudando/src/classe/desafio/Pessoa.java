package classe.desafio;

public class Pessoa {
    
    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida){
        if(comida != null){
            this.peso += comida.peso; // acrescentando o peso da comida ao peso da pessoa (engordando-a)
        }
    }

    String apresentar() {
        return "Ola eu sou o "+ nome + " e tenho " + peso + "kgs.";
    }
}
