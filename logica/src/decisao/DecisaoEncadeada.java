package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		/*
		 * Solicitem as faltas
		 * Para que o aluno esteja aprovado ele precisa ter a qtde de faltas menor que 20
		 * e a nota maior ou igual a 6
		 * (vale para o exame tb)
		 */

		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite qtde de faltas"));
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina").toUpperCase();

		if (faltas<20) {

			float priNota = Float.parseFloat(JOptionPane.showInputDialog("Digite 1a nota"));
			float segNota = Float.parseFloat(JOptionPane.showInputDialog("Digite 2a nota"));
			float media = (priNota + segNota)/2;


			if(media >= 6) {   
				System.out.println("Você foi aprovado na disciplina: " + disciplina);
			}

			else if(media < 4) {  
				System.out.println("Você foi reprovado na disciplina: " + disciplina);
			}

			else {   
				System.out.println("Você tem chance na disciplina: " + disciplina);
			}

			System.out.println(("Média: " + media));
		}else {
			System.out.println("Você foi reprovado por faltas.");
		}




	}
}
