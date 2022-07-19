package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.9);
		Aluno a2 = new Aluno("Lily", 5.9);
		Aluno a3 = new Aluno("Zeit", 2.9);
		Aluno a4 = new Aluno("Emily", 7.2);
		Aluno a5 = new Aluno("Schmetterling", 7.9);
		Aluno a6 = new Aluno("Hans", 7.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado = 
				a -> "Parabens " + a.nome + "! Voce esta aprovado(a)!\n";
				
		alunos.stream()
			.filter(aprovado)
			.map(saudacaoAprovado)
			.forEach(System.out::println);
	}
}
