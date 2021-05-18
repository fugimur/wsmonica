package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class TesteLista {
	/*
	 * Caracteristicas da Collection List
	 * - tamanho é dinamico
	 * - nao ha necessidade de qq recurso para conrolar o indice
	 * - os dados podem ser heterogeneos
	 */

	public static void main(String[] args) {
		// sinal de <> é chamado de generics para conter o tipo de dado da lista
		// vai tanto na criação (antes do =) e na instanciacao (apos o =), este ultimo nao é obrigatorio ter o conteudo
		List<String> lista = new ArrayList<String>();
		do {
			lista.add(JOptionPane.showInputDialog("Digite um cargo"));
		}while(JOptionPane.showConfirmDialog
				(null, "Continuar?", "", JOptionPane.YES_NO_OPTION)==0);
		
		System.out.println(lista);
		//lista.add(7);
		//lista.add(true);
		//lista.add('a');
		System.out.println("Primeiro: " + lista.get(0));  //exibindo o primeiro da lista
		lista.remove(0);  //removendo o primeiro elemento
		System.out.println("Depois de remover: " + lista);
		Collections.sort(lista);
		System.out.println("Ordenada: " + lista);
		for (int contador=0;contador<lista.size();contador++) {
			System.out.println("Cargo " + contador +": " + lista.get(contador));
		}
		
		
	
		

	}

}
