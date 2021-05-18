package br.com.bankofoz.principal;

import br.com.bankofoz.beans.Agencia;
import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Endereco;
import br.com.bankofoz.beans.Poupanca;
import br.com.bankofoz.util.Magic;

public class TesteConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		int numero = Magic.i("Numero Conta:");
		double saldo = Magic.d("Saldo:");

		Cliente cliente = new Cliente(
				"Monica",
				"moni.fugi@gmail",
				"11988887777",
				new Endereco(),
				01
				/*
				Magic.s("Nome:"),
				Magic.s("Email:"),
				Magic.s("Fone:"),
				new Endereco(),
				Magic.i("ID:")
				 */
				);

		Agencia agencia = new Agencia(
				"CTO",
				5305,
				"11922223333"
				/*
				Magic.s("Nome Agencia:"),
				Magic.i("No.:"),
				Magic.s("Fone ag:")
				 */
				); 

		char resposta = Magic.s("Digite C-Conta Corrente ou P-Poupança").charAt(0);

		if (resposta=='C') {
			conta = new Corrente(
					numero,
					saldo,
					cliente,
					agencia,
					Magic.d("Limite:"),
					Magic.d("Taxa:")
					);
		}else if (resposta=='P') {
			conta = new Poupanca(
					numero,
					saldo,
					cliente,
					agencia,
					Magic.d("Rendimento:"),
					Magic.s("Aniversario:")
					);
		}else {
			System.out.println("Opção inválida");
		}	

		System.out.println(conta.toString());

		conta.depositar(1000);
		System.out.println("Depositou: " + conta.getSaldo());
		conta.sacar(500);
		System.out.println("Sacou: " + conta.getSaldo());
		conta.sacar(10000);
		System.out.println("Sacou absurdo: " + conta.getSaldo());

		if (conta instanceof Poupanca) {
			((Poupanca) conta).creditarRendimento();
			System.out.println("Dia: " + ((Poupanca) conta).getDiaAniversario());
			System.out.println("Saldo: " + conta.getSaldo());
		}else {
			((Corrente) conta).debitarTaxa();
			System.out.println("Saldo: " + conta.getSaldo());

		}

	}



}