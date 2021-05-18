package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Curso;
import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.modelo.Turma;

public class ImplementarTurma {

	public static void main(String[] args) {

		Turma turma = new Turma(
				1,
				"Turma18C",
				"Diurno",
				new Aluno(
						12345,
						"nome aluno",
						"email aluno",
						"celu aluno",
						"cpf aluno",
						new Endereco(
								"end aluno",
								"bairro aluno",
								"cidade aluno",
								"estado aluno",
								"cep aluno",
								"num resid aluno",
								"complemento aluno"
								)
						),
				new Professor(
						new Endereco(
								"rua prof",
								"bairro prof",
								"cidade prof",
								"estado prof",
								"cep prof",
								"123",
								"ap prof"
								),
						"nome prof",
						"titulo prof",
						1000
						),
				new Curso(
						"descricao curso",
						"sigla curso",
						5000,
						"formacao"
						)
				);

		System.out.println("Professor: " + turma.getProfessor().getNome());
		System.out.println("Aluno: " + turma.getAluno().getNome());
		System.out.println("Cidade aluno: " + turma.getAluno().getEndereco().getCidade());
		System.out.println("Curso: " + turma.getCurso().getDescricao());
		System.out.println("Turma: " + turma.getNome());
	}

}
