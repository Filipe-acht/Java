package oo.heranca;

public class Jogador {

	public int vida = 100;
	public int x;
	public int y;
	
	// metodo atacar
	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) { //podem atacar um ao outro, pois estão lado a lado
			oponente.vida -= 10;
			return true;
		} else if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}
	
	// enum tbm define um tipo
	// metod andar
	public boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		/*if(direcao == Direcao.NORTE) {
			y++;
		}*/
		return true;
	}
}
