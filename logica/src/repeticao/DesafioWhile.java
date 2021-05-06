package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		/*
		 * Capturar: dia, mes e ano em variaveis diferentes
		 * Valide o dia para que ele esteja entre 1 e 30 ou 1 e 31 ou 1 e 29
		 * Valide o mes para que esteja entre 1 e 12
		 * Valide o ano para que seja menor que 2003 e maior que 1952
		 * 
		 * Exibir a data completa
		 * Dica: validar 1o o ano, depois o mes e depois o dia
		 */

		// define variaveis
		short ano = Short.parseShort(JOptionPane.showInputDialog("Dgite o ano"));
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Dgite o mês"));
		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Dgite o dia"));
		
		// consiste ano
		while (ano <= 1952 || ano >= 2003) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Dgite o ano entre 1953 e 2002"));
		}

		// consiste mes
		while (mes < 1 || mes > 12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("Dgite o mes entre 1 e 12"));
		}
		if (mes == 2) {  // fev
			while (dia < 1 || dia > 29) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dgite o dia entre 1 e 29"));
			}
		}
		else if(mes==4 || mes==6 || mes==9 || mes==11) {  // meses com 30 dias
			while (dia < 1 || dia > 30) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dgite o dia entre 1 e 30"));
			}
		}
		else {  // demais meses
			while (dia < 1 || dia > 31) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dgite o dia entre 1 e 31"));
			}
		}

		// mostra a data
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);

	}
}

