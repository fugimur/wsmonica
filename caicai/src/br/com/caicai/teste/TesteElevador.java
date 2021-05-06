package br.com.caicai.teste;

import javax.swing.JOptionPane;

import br.com.caicai.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {

		// 1o instanciar um objeto, nesse caso o objeto=elevador
		Elevador elevador = new Elevador();

		// 2o preencher os dados
		// nome, andar max, andar min, capacidade de pessoas
		elevador.inicializar("Torre CEIC", 15, 0, 8);
		System.out.println(elevador.retornarTudo());

		System.out.println(elevador.subir());
		elevador.entrar();
		elevador.entrar();
		elevador.entrar(5);
		System.out.println(elevador.descer());
		elevador.sair();
		System.out.println(elevador.retornarTudo());

	}

}
