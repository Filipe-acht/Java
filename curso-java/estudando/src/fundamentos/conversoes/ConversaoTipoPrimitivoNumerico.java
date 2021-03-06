package fundamentos.conversoes;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 1; // conversão implícita de um int para um double
		System.out.println(a);

		// float b = 1.0F; // F - para tornar um literal num float

		// Conversão explícita( CAST )
		float b = (float) 1.123458;// converta para float e armazene numa variavel float
		System.out.println(b);

		int c = 127;
		// byte d = c; //não funciona
		byte d = (byte) c; // explícita (CAST)
		System.out.println(d);

		double e = 1;
		int f = (int) e; // explícita (CAST)
		System.out.println(f);
	}

}
