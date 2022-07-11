package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String nome;
	final List<Aluno> alunos = new ArrayList<>(); // não posso alterar endereço de memória
	
	Curso(String nome){
		this.nome = nome;
	}
	
	// metodo adicionar aluno
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this); //relação bidirecional
	}
}
