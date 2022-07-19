package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Lily", 7.1);
		Aluno a2 = new Aluno("Zahl", 8.1);
		Aluno a3 = new Aluno("Hans", 5.1);
		Aluno a4 = new Aluno("Acht", 6.1);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();

		// são funções terminadoras
		System.out.println(alunos.stream().allMatch(aprovado)); // todos foram aprovados?
		System.out.println(alunos.stream().anyMatch(aprovado)); // tem alunos aprovados?
		System.out.println(alunos.stream().noneMatch(aprovado)); // nenhum foi aprovado?
		System.out.println(alunos.stream().noneMatch(reprovado)); // nenhum foi reprovado?
	}
}
