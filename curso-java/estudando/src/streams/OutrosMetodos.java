package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Eins", 7.1);
		Aluno a2 = new Aluno("Zwei", 8.1);
		Aluno a3 = new Aluno("Drei", 5.1);
		Aluno a4 = new Aluno("Vier", 6.1);
		Aluno a5 = new Aluno("Vier", 6.1);
		Aluno a6 = new Aluno("Sechs", 6.1);
		Aluno a7 = new Aluno("Sieben", 10);
		Aluno a8 = new Aluno("Acht", 2.1);

		List<Aluno> alunos = 
				Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		System.out.println("===== Outros Metodos =====\n");
		System.out.println("Metodo Distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nMetodo Skip/Limit...");
		alunos.stream()
			.distinct()
			.skip(2) // pule dois elementos
			.limit(2) // pegue apenas 2 elementos
			.forEach(System.out::println);
		
		System.out.println("\nMetodo takenWhile...");
		alunos.stream()
			.distinct()
			.skip(2)
			.takeWhile(a -> a.nota >= 7) // pegue todos os alunos enquantos eles estão sendo aprovados
			.forEach(System.out::println);
		
	}
}
