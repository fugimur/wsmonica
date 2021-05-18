package br.com.execao.teste;

import javax.swing.JOptionPane;

import br.com.excecao.excecoes.MinhaExcecao;

public class TesteExcecao {

	public static void main(String[] args) {
		// Excecoes unchecked (DC) - depois da compilacao
		// Excecoes checked (AC) - antes da compilacao

		try {
			/*
			int numero = Integer.parseInt("7");
			System.out.println("Número: " + numero);

			String palavra="testando";
			System.out.println("Qtde letras: " + palavra.length());
			 */

			/*
			 * Particularidades dos vetores:
			 * - seu tamanho é estatico
			 * - os dados sao homogeneos, ou seja, todos do mesmo tipo
			 * - exige uma variavel para controlar as posiçoes (indice)
			 * - nao é possivel remover uma posicao
			 * - ordenacao dá trabalho pra fazer
			 * 
			 */
			String palavras[] = new String[10];
			int indice = 0;
			do {
				palavras[indice] = JOptionPane.showInputDialog("Digite uma palavra");
				indice++;
			}while(JOptionPane.showConfirmDialog
					(null, "Continuar?", "Vetores", JOptionPane.YES_NO_OPTION)==0);
			System.out.println(palavras); // posição de memória
			for (int contador=0;contador<indice;contador++) {
				System.out.println("Palavra nº " + (contador+1) + ": " + palavras[contador]);
			}		

		}catch(Exception e) {  // tem que ficar por ultimo, é o pai de todas as exceptions
			System.err.println(MinhaExcecao.tratar(e));
			// mostra o detalhe do erro
			// e.printStackTrace();
		}finally {  // executa sempre, independente se deu ok ou se deu ruim
			System.out.println("Volte sempre");
			//encerrar banco de dados
		}

	}

}
