package variaveis;

import javax.swing.JOptionPane;

/* 
 * para documentar um bloco de mensagens
 * para apenas 1 linha pode ser usado o //
 */

public class TiposDados {
	// main é o método start point de uma app Java
	public static void main(String[] args) {
		//<Tipo de dado> <nome/identificador> = <valor>;
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		double imc = peso / (altura * altura); 
		System.out.println("Nome..: " + nome);
		System.out.println("Idade.: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("IMC...: " + imc);
		
		/*
		 * Tipos de dados (só tem 2):
		 * Numérico: é o dado que pode ser utilizado em expressões matemáticas
		 * e/ou for um dado crítico para o cenário que se propóe.	 .,- tbem são considerados
		 * CEP (diante de um contexto dos Correiors): 00010-009 => 1
		 * Telefone (do delivery da pizzaria)
		 * muito mais performático que o alfa
		 * Em Javanês:
		 * - int    => somente para números inteiros
		 * - double => para números com casas decimais (números reais)
		 * int e double são tipos primitivos - começam com letra minúscula
		 * 
		 * Alfanumérico: é o dado que não está envolvido em operações matemáticas.
		 * CEP (do colaborador do Itau para o RH): 00010-009 => 00010-009
		 * Telefone (do cliente do Itau)
		 * - String
		 * começa com letra maiúscula, é uma classe
		 */













	} // fechando o método

} // fechando a classe
