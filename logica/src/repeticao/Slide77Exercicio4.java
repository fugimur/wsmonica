package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio4 {

	public static void main(String[] args) {

		int qtdeMaiores = 0;
		int somaIdade = 0;
		int qtdePessoas = 0;
		int somaIdades = 0;
		String nomeOlder="";
		String nomeNewer="";
		int menorIdade = 0;
		int maiorIdade = 0;

		do {
			String nome = JOptionPane.showInputDialog("Digite o nome");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
			
			if (idade>maiorIdade) {
				maiorIdade=idade;
				nomeOlder=nome;
			}
			if (idade<menorIdade || qtdePessoas == 0) {    // para o 1o input tbem seta a menor idade 
				menorIdade=idade;
				nomeNewer=nome;
			}
			if (idade>=18) {
				qtdeMaiores++;
			}
			somaIdades=somaIdades+idade;
			// somaIdade+=idade
			qtdePessoas++;


		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Título", JOptionPane.YES_NO_OPTION)==0);

		System.out.println("Qtde pessoas maiores de idade: " + qtdeMaiores);
		System.out.println(("Média das idades: " + somaIdades/qtdePessoas));
		System.out.println("Pessoa mais experiente: " + nomeOlder + " - " + maiorIdade + " anos");
		System.out.println("Pessoa mais jovem: " + nomeNewer + " - " + menorIdade + " anos");
	}
}