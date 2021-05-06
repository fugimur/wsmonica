package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {

		String email = JOptionPane.showInputDialog("Dgite o email").toLowerCase();
		while (email.contains("@")==false) {
			email = JOptionPane.showInputDialog("Dgite o email com @").toLowerCase();
		}
		
		System.out.println("usuário: " + email.substring(0,email.indexOf("@")));
		String nome = JOptionPane.showInputDialog("Dgite o nome").toLowerCase();
		// exibam o nome somente se o nome tiver mais que 3 caracteres e
		// menos que 15 caracteres
		
		while (nome.length() <= 3 || nome.length() >= 15 ) {
			nome = JOptionPane.showInputDialog("Dgite o nome com 4 a 14 caracteres").toLowerCase();
		}
		
		System.out.println("nome: " + nome);
		
		
		
	}

}
