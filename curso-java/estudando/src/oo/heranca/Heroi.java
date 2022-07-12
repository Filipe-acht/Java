package oo.heranca;

// definindo uma herança(extends)
//herói vai receber codigo através de reuso
public class Heroi extends Jogador{ 

	// Modificando comportamento do metodo pai 
	@Override
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);// vou chamar o metodo que foi definido na superclasse
		boolean ataque2 = super.atacar(oponente);// pra atacar o dobro
		return ataque1 || ataque2;
	}
	// outra forma
	/*boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) { // podem atacar um ao outro, pois estão lado a lado
			oponente.vida -= 20;
			return true;
		} else if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
		} else {
			return false;
		}
	}*/
}
