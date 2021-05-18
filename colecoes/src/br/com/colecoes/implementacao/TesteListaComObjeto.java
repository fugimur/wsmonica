package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListaComObjeto {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();
		
		lista.add(new Cargo("DBA", "JR", 5000));
		lista.add(new Cargo("DEV", "JR", 4000));
		lista.add(new Cargo("Gerente de Projetos", "JR", 4500));
		lista.add(new Cargo("DBA", "SR", 15000));
		
		System.out.println("Completa: " + lista);
		
		double total = 0;
		double media = 0;
		double totalDBA = 0;
		int qtdeJr=0;
		Cargo resposta = new Cargo();
		
		
		for (Cargo objeto : lista) {
			System.out.println("Cargo: " + objeto.getNome());
			System.out.println("Nivel: " + objeto.getNivel());
			System.out.println("Salario: " + objeto.getSalario());
			System.out.println("===========================");
			// total+=objeto.getSalario();
			total = total + objeto.getSalario();
			if (objeto.getNome().equals("DBA")) {
				totalDBA+=objeto.getSalario();
			}
			if (objeto.getNivel().equalsIgnoreCase("JR")) {
				qtdeJr++;
			}
			if (objeto.getSalario()>resposta.getSalario()) {
				resposta=objeto;
			}
		}
		
		System.out.println("Total Salario: " + total);
		
		media = total / lista.size();
		System.out.println("M�dia Salario: " + media);
		
		System.out.println("Total DBA: " + totalDBA);
		System.out.println("Qtde Jrs: " + qtdeJr);
		System.out.println("Cargo com maior salario: " + resposta);
		
		/*
		 * Requisi��o:
		 * - exibir o total de salario
		 * - m�dia dos salarios
		 * - o total dos DBA�s
		 * - a qtde de cargos nivel junior
		 * - o nome do cargo e o nivel que possui o maior salario
		 */
		
	}

}
