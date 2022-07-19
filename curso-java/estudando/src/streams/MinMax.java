package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Lily", 7.1);
		Aluno a2 = new Aluno("Zahl", 8.1);
		Aluno a3 = new Aluno("Hans", 5.1);
		Aluno a4 = new Aluno("Acht", 6.1);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if (aluno1.nota > aluno2.nota)
				return 1;
			if (aluno1.nota < aluno2.nota)
				return -1;
			return 0;
		};

		Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
			if (aluno1.nota > aluno2.nota)
				return -1;
			if (aluno1.nota < aluno2.nota)
				return 1;
			return 0;
		};
		System.out.println("Maior e Meno, melhor nota: ");
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		
		System.out.println("\nMaior e Meno, pior nota: ");
		System.out.println(alunos.stream().max(piorNota).get());
		System.out.println(alunos.stream().min(piorNota).get());
	}
}
