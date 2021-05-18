package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Endereco;

public class ImplementarAlunoContrutor {

	public static void main(String[] args) {
		// CTRL espaço mostra os argumentos definidos no modelo Aluno
		Aluno aluno = new Aluno(
				Integer.parseInt(JOptionPane.showInputDialog("RM")),
				JOptionPane.showInputDialog("Nome").toUpperCase(),
				JOptionPane.showInputDialog("Email").toLowerCase(),
				JOptionPane.showInputDialog("Fone"),
				JOptionPane.showInputDialog("CPF"),
				new Endereco(
						JOptionPane.showInputDialog("Logradouro").toUpperCase(),
						JOptionPane.showInputDialog("Bairro").toUpperCase(),
						JOptionPane.showInputDialog("Cidade").toUpperCase(),
						JOptionPane.showInputDialog("Estado").toUpperCase(),
						JOptionPane.showInputDialog("CEP").toUpperCase(),
						JOptionPane.showInputDialog("Numero").toUpperCase(),
						JOptionPane.showInputDialog("Complemento").toUpperCase()
						)
				);

		// System.out.println(aluno.toString());

		// Mostra somente o logradouro
		System.out.println(aluno.getEndereco().getLogradouro());
	}

}
