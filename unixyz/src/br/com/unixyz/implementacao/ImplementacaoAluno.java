package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;

public class ImplementacaoAluno {

	public static void main(String[] args) {
		
		// 1o instanciar um objeto, nesse caso o objeto=elevador
		Aluno aluno = new Aluno();
		
		aluno.setBasico("MONICA", 12345);
		aluno.setCpf("12345678911");
		aluno.setEmail("monicafugi@itau.com.br");
		aluno.setFone("1234-5678");
		
		System.out.println(aluno.toString());
		System.out.println(aluno.getUsuario());

	}

}
