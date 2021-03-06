package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		
		/*
		 * Capturarem:
		 * - nome da disciplina
		 * - primeira nota
		 * - segunda nota
		 * - calcular a media
		 * - exibir a media
		 */
		
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina").toUpperCase();
		float priNota = Float.parseFloat(JOptionPane.showInputDialog("Digite 1a nota"));
		float segNota = Float.parseFloat(JOptionPane.showInputDialog("Digite 2a nota"));
		float media = (priNota + segNota)/2;
		
		/*
		 * "Voce foi reprovado" => media menor que 4
		 * "Voce tem chance no exame" => media entre 5.9 e 4
		 */
		
		if(media < 4) {   // ou ? representado por ||
			System.out.println("Voc? foi reprovado na disciplina: " + disciplina);
		}
		
		if(media >= 4 && media < 6) {   // ou ? representado por ||
			System.out.println("Voc? tem chance na disciplina: " + disciplina);
		}
				
		if(media >=6) {   // ou ? representado por ||
			// somente vai ser executado se a condi??o for verdadeira
			System.out.println("Voc? foi aprovado na disciplina: " + disciplina);
		}
		
		System.out.println(("M?dia: " + media));
			
		
		
		
	}
}
