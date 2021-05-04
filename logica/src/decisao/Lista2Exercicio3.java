package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio3 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
		char operacao = JOptionPane.showInputDialog
				("Digite: \n<+> Somar\n<-> Subtrair\n<*> Multiplicar\n</> Dividir").charAt(0);
		int resultado=0;
		
		if(operacao=='+') {   
			resultado = num1 + num2;
		}
		else if(operacao=='-') {   
			resultado = num1 - num2;
		}
		else if(operacao=='*') {
			resultado = num1 * num2;
			System.out.println("Resultado = " + resultado);
		}
		else if (operacao=='/') {  //divisao
			resultado = num1 / num2;
		}
		else {
			System.out.println("Opção inválida");
		}
		System.out.println("resultado = " + resultado);
	}

}
