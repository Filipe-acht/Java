package oo.abstrato;

public class TesteAbstrato {

	public static void main(String[] args) {
		Mamifero a = new Cachorro();
		System.out.println("Se move " + a.mover());
		System.out.println("Se alimenta " + a.mamar());
		System.out.println("Respira " + a.respirar());
	}
}
