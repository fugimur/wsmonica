package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio3 {

	public static void main(String[] args) {

		String nivel = "";
		int qtdeMed=0;
		int qtdeSup=0;
		int qtdePos=0;

		do {
			nivel = JOptionPane.showInputDialog("Digite n�vel escolaridade: \nM�dio\nSuperior\nP�s\nFim");
			if (nivel.equals("M�dio")) {
				qtdeMed++;
			}
			else if (nivel.equals("Superior")) {
				qtdeSup++;
			}
			else if (nivel.equals("P�s")) {
				qtdePos++;
			}
		}while (nivel.contains("M�dio") || nivel.contains("Superior") || nivel.contains("P�s"));

		if (qtdeMed > qtdeSup && qtdeMed > qtdePos) {
			JOptionPane.showMessageDialog(null, "M�dio = " + qtdeMed);
		}
		else if(qtdeSup > qtdeMed && qtdeSup > qtdePos) {
			JOptionPane.showMessageDialog(null, "Superior = " + qtdeSup);
		}
		else {
			JOptionPane.showMessageDialog(null, "P�s = " + qtdePos);
		}
	}
}
