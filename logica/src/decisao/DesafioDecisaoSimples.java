package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		
		/*
		 * Pedir: nome e idade
		 * De acordo com as regras para vota??o no Brasil, oriente o usu?rio se ele pode voltar,
		 * se ele n?o pode otar ou se o voto dele ? facultativo
		 * >70, =16 ou =17 ? facultativo
		 */

		String nome = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade"));
		
		if(idade < 16) {   
			System.out.println(nome + ", voc? nao pode votar (menor de 16 anos)");
		}
		
		if(idade == 16 || idade == 17 || idade > 70) {   
			System.out.println(nome + ", seu voto ? facultativo (16, 17 ou maior de 70 anos)");
		}
		
		if(idade >= 18 && idade <= 70) {   
			System.out.println(nome + ", seu voto ? obrigat?rio (entre 18 e 70 anos)");
		}
		
	}

}
