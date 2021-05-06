package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio3 {

	public static void main(String[] args) {

		String nivel = "";
		int qtdeMed=0;
		int qtdeSup=0;
		int qtdePos=0;

		do {
			nivel = JOptionPane.showInputDialog("Digite nível escolaridade: \nMédio\nSuperior\nPós\nFim");
			if (nivel.equals("Médio")) {
				qtdeMed++;
			}
			else if (nivel.equals("Superior")) {
				qtdeSup++;
			}
			else if (nivel.equals("Pós")) {
				qtdePos++;
			}
		}while (nivel.contains("Médio") || nivel.contains("Superior") || nivel.contains("Pós"));

		if (qtdeMed > qtdeSup && qtdeMed > qtdePos) {
			JOptionPane.showMessageDialog(null, "Médio = " + qtdeMed);
		}
		else if(qtdeSup > qtdeMed && qtdeSup > qtdePos) {
			JOptionPane.showMessageDialog(null, "Superior = " + qtdeSup);
		}
		else {
			JOptionPane.showMessageDialog(null, "Pós = " + qtdePos);
		}
	}
}
