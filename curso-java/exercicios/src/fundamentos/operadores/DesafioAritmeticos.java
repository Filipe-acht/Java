package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		double eq1 = 6 * (3 + 2);
		double eq1_1 = Math.pow(eq1, 2) / (3 * 2);
		
		double eq2 = ((1 - 5) * (2 - 7) ) / 2;
		double eq2_1 = Math.pow(eq2, 2);
		
		double eq3 = eq1_1 - eq2_1;
		double eq3_1 = Math.pow(eq3, 3);
		double eq3_1_1 = Math.pow(10, 3);
		double eq3_1_1_1 = eq3_1 / eq3_1_1;
		
		
		
		//System.out.println(eq1);
		//System.out.println(eq1_1);
		//System.out.println(eq2);
		//System.out.println(eq2_1);
		//System.out.println(eq3);
		//System.out.println(eq3_1);
		//System.out.println(eq3_1_1);
		System.out.println((int) eq3_1_1_1);
	}
}
