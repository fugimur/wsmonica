package variaveis;

import javax.swing.JOptionPane;

public class TiposDadosDesafio {

	public static void main(String[] args) {

		/*
		 * Capturem: o nome de um produto, o valor
		 * de compra, e a qtde.
		 * Sobre o valor de compra considerem um lucro de 
		 * 20% para obterem o valor de venda
		 * Calcule o total considerando o valor de venda e qtde
		 * Sobre o total acima calcule 22% de impostos
		 * No final exiba:
		 * O nome do produto
		 * O valor de venda
		 * O Total sem impostos
		 */

		String produto = JOptionPane.showInputDialog("Digite o produto");
		double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de compra"));
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		double valorVenda = valorCompra * 1.2;
		double totalVenda = valorVenda * qtde;
		double impostos = totalVenda * 0.22;
		System.out.println("Produto: " + produto);
		System.out.println("Valor de Venda: " + valorVenda);
		System.out.println("Total sem Impostos: " + (totalVenda-impostos));




	}

}
