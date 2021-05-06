package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * O Jogador1 irá digitar um número.
		 * Caberá ao Jogador 2 descobrir qual foi o número digitado pelo Jogador1.
		 * Primeira Missão:
		 * - fazer com que a aplicação pergunte o número para o Jogador 2 enquanto
		 * ele não acertar o número, e quando acertar exibir a mensagem de Parabens
		 * 
		 * Segunda Missao:
		 * - após o Jogador2 chutar o número você deve exibir para ele uma
		 * dica, informando se o número digitado pelo Jogador1 é maior ou menor
		 * que o número que ele digitou.
		 * 
		 * Terceira Missao:
		 * - Quando o Jogador2 acertar, junto a mensagem de parabéns deverá exibir
		 * quantas tentativas ele utilizou até acertar o número (dica: terá
		 * que utilizar uma variável para contar)
		 */

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador1, digite um número"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2, acerte o número do Jogador1"));
		byte tentativa = 1;

		do {
			if (num2 > num1) {
				num2 = Integer.parseInt(JOptionPane.showInputDialog("O número é menor, tente novamente"));
				tentativa = (byte) (tentativa + 1);
				// tentativa++;
				// tentativa+=1;
				
			} else if (num2 < num1) 	{
				num2 = Integer.parseInt(JOptionPane.showInputDialog("O número é maior, tente novamente"));
				tentativa = (byte) (tentativa + 1);
			}
		}while (num2 != num1);

		if (tentativa == 1) {
			JOptionPane.showMessageDialog(null, "PARABÉNS!!! Você acertou na 1a tentativa!");
		} else {
			JOptionPane.showMessageDialog(null, "PARABÉNS!!! Você acertou após " + tentativa + " tentativas!");
		}

	}

}
