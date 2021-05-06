package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * O Jogador1 ir� digitar um n�mero.
		 * Caber� ao Jogador 2 descobrir qual foi o n�mero digitado pelo Jogador1.
		 * Primeira Miss�o:
		 * - fazer com que a aplica��o pergunte o n�mero para o Jogador 2 enquanto
		 * ele n�o acertar o n�mero, e quando acertar exibir a mensagem de Parabens
		 * 
		 * Segunda Missao:
		 * - ap�s o Jogador2 chutar o n�mero voc� deve exibir para ele uma
		 * dica, informando se o n�mero digitado pelo Jogador1 � maior ou menor
		 * que o n�mero que ele digitou.
		 * 
		 * Terceira Missao:
		 * - Quando o Jogador2 acertar, junto a mensagem de parab�ns dever� exibir
		 * quantas tentativas ele utilizou at� acertar o n�mero (dica: ter�
		 * que utilizar uma vari�vel para contar)
		 */

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador1, digite um n�mero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2, acerte o n�mero do Jogador1"));
		byte tentativa = 1;

		do {
			if (num2 > num1) {
				num2 = Integer.parseInt(JOptionPane.showInputDialog("O n�mero � menor, tente novamente"));
				tentativa = (byte) (tentativa + 1);
				// tentativa++;
				// tentativa+=1;
				
			} else if (num2 < num1) 	{
				num2 = Integer.parseInt(JOptionPane.showInputDialog("O n�mero � maior, tente novamente"));
				tentativa = (byte) (tentativa + 1);
			}
		}while (num2 != num1);

		if (tentativa == 1) {
			JOptionPane.showMessageDialog(null, "PARAB�NS!!! Voc� acertou na 1a tentativa!");
		} else {
			JOptionPane.showMessageDialog(null, "PARAB�NS!!! Voc� acertou ap�s " + tentativa + " tentativas!");
		}

	}

}
