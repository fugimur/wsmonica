package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		/*
		 * Sintaxe do "for" é formada por 3 parametros, separados por ;
		 * - variavel que vai contar e o valor que ela vai iniciar
		 * - condicao (ate quando o laco vai ser repetido)
		 * - a forma de contagem (de 1 em 1, 2 em 2, etc)
		 */
		
		// tabuada: numero x contador = resultado
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
				
		for (int cont=1;cont<11;cont+=1) {
			System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
		}

	}

}
