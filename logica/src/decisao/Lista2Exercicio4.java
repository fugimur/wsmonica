package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio4 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor 1"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor 2"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor 3"));

		if ((num1 == num2) || (num1 == num3) || (num2 == num3)) {
			System.out.println("Valores iguais, n�o executado");
		}
		else {
			int pri=0;
			int seg=0;
			int ter=0;

			if (num1 > num2 && num1 > num3) {
				pri=num1;
				if (num2 > num3) {
					seg=num2;
					ter=num3;
				}
				else {
					seg=num3;
					ter=num2;
				}
			}
			else if (num2 > num3 && num2 > num1) {
				pri=num2;
				if (num3 > num1) {
					seg=num3;
					ter=num1;
				}
				else {
					seg=num2;
					ter=num1;
				}
			}
			else  {
				pri=num3;
				if (num2 > num1) {
					seg=num2;
					ter=num1;
				}
				else {
					seg=num1;
					ter=num2;
				}
			}
			System.out.println(pri);
			System.out.println(seg);
			System.out.println(ter);
		}
	}
}




