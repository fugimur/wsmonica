package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Nome cliente").toUpperCase();
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Digite qtde de di?rias"));

		if(diarias > 15) {   
			float conta = (80 + (float) 5.5) * diarias;
			System.out.println(nome + " - Valor a pargar: R$ " + conta);
		}
		else if(diarias == 15) {
			float conta = (80 + 6) * diarias;
			System.out.println(nome + " - Valor a pargar: R$ " + conta);
		}
		else {
			float conta = (80 + 8) * diarias;
			System.out.println(nome + " - Valor a pargar: R$ " + conta);
		}

	}
	
	/* outra maneira de fazer
	 * 	float taxa = (float) 5.5;
   	 *	if (diarias==15) {
	 *		taxa = 6;
	 *	}else if (diarias<15) {
	 *		taxa = 8;
	 *	}
	*/

}
