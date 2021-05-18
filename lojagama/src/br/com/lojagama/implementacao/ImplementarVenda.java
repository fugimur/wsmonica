package br.com.lojagama.implementacao;

import br.com.lojagama.modelo.Cliente;
import br.com.lojagama.modelo.Endereco;
import br.com.lojagama.modelo.Pagamento;
import br.com.lojagama.modelo.Produto;
import br.com.lojagama.modelo.Venda;
import br.com.lojagama.util.Magic;


public class ImplementarVenda {
	
	public static void main(String[] args) {

		Venda venda = new Venda(
				Magic.i("NF"),
				Magic.s("Data"),
				new Cliente(
						Magic.s("Nome Cliente"),
						Magic.s("Email").toLowerCase(),
						"91234-5678",
						new Endereco()
						),
				new Produto(
						123,
						"banana",
						Magic.d("Valor Compra"),
						Magic.d("Valor Venda"),
						Magic.i("Quantidade")
						),
				new Pagamento(
						500,
						"cartao de credito",
						"12/05/2021"
						),
				1000
				);


		System.out.println(venda.getResumo());
		System.out.println("Sobre o estoque: " + venda.getProduto().verificarEstoque());
		System.out.println("Venda: " + venda.getProduto().getValorVenda());
		System.out.println("Compra " +venda.getProduto().getValorCompra());

		venda.getProduto().atualizarValores(10);
		System.out.println("Após atualização: ");
		System.out.println("Venda: " + venda.getProduto().getValorVenda());
		System.out.println("Compra " +venda.getProduto().getValorCompra());
		System.out.println("Total Venda: " + venda.getProduto().totalVenda());
	}

}
