package variaveis;

import javax.swing.JOptionPane;

/* 
 * para documentar um bloco de mensagens
 * para apenas 1 linha pode ser usado o //
 */

public class TiposDados {
	// main � o m�todo start point de uma app Java
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
		 * Tipos de dados (s� tem 2):
		 * Num�rico: � o dado que pode ser utilizado em express�es matem�ticas
		 * e/ou for um dado cr�tico para o cen�rio que se prop�e.	 .,- tbem s�o considerados
		 * CEP (diante de um contexto dos Correiors): 00010-009 => 1
		 * Telefone (do delivery da pizzaria)
		 * muito mais perform�tico que o alfa
		 * Em Javan�s:
		 * - int    => somente para n�meros inteiros
		 * - double => para n�meros com casas decimais (n�meros reais)
		 * int e double s�o tipos primitivos - come�am com letra min�scula
		 * 
		 * Alfanum�rico: � o dado que n�o est� envolvido em opera��es matem�ticas.
		 * CEP (do colaborador do Itau para o RH): 00010-009 => 00010-009
		 * Telefone (do cliente do Itau)
		 * - String
		 * come�a com letra mai�scula, � uma classe
		 */













	} // fechando o m�todo

} // fechando a classe
