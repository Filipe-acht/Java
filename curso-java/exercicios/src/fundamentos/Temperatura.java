package fundamentos;

public class Temperatura {

	// (ºF - 32) x 5/9(no java 5/9.0 ou 5.0/9.0 ou 5.0/9) = ºC
	public static void main(String[] args) {
		
		final double FATOR  = 5.0 / 9;
		final double AJUSTE = 32;
		double fahrenheit = 145.5;
		
		
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado eh " + celsius + "C."); // ALT + arrows(mover codigo)
		System.out.println("O resultado eh " + celsius + "C."); // CTRL ALT + down (duplica linha)
		
	}
}
