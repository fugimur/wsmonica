package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {

		do {
			float salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("Salário"));
			float valorExtras = Float.parseFloat(JOptionPane.showInputDialog("Valor Extras"));
			float fgts = (salarioBruto + valorExtras) * (float) 0.08;
			System.out.println("Salário Bruto: " + (salarioBruto + valorExtras));
			System.out.println("FGTS: " + fgts);
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Título", JOptionPane.YES_NO_OPTION)==0);  // o showConfirmDialog retorna um inteiro e o 0 é o sim
		
		






	}

}
