package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Endereco;

public class ImplementacaoAluno {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setBasico("MONICA", 12345);
		aluno.setCpf("12345678911");
		aluno.setEmail("monicafugi@itau.com.br");
		aluno.setFone("1234-5678");

		Endereco endereco = new Endereco();
		endereco.setBairro("JABAQUARA");
		endereco.setCep("12345-123");
		endereco.setCidade("São Paulo");
		endereco.setComplemento("Ap 123");
		endereco.setEstado("SP");
		endereco.setLogradouro("Av Sabia");
		endereco.setNumero("999");

		aluno.setEndereco(endereco);

		// System.out.println(aluno.getNome());

		System.out.println(aluno.toString());
		
		// System.out.println(aluno.getUsuario());

	}

}
