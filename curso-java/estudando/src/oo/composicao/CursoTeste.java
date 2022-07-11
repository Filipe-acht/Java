package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Lily");
		Aluno aluno2 = new Aluno("Filipe");
		Aluno aluno3 = new Aluno("Emily");
		
		Curso curso1 = new Curso("Java Completo"); 
		Curso curso2 = new Curso("Web 2023"); 
		Curso curso3 = new Curso("React Native");
		
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		curso3.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno3);
		
		for (Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no " 
					+ curso3.nome + "...");
			System.out.println("... e o meu nome e " + aluno.nome);
			System.out.println();
		}
		System.out.println(aluno1.cursos.get(0).alunos);
				
		Curso cursoEncontrado = aluno1.getCursoPorNome("Java Completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome); //curso buscado
			System.out.println(cursoEncontrado.alunos); // alunos matriculados
		}
	}
}
