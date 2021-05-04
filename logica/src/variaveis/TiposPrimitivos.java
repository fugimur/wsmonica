package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		/*
		 * Tipos primitivos: s�o os tipos que est�o dentro da linguagem
		 * 
		 * boolean = tipo l�gico (true/false)
		 * char = 1 caracter (apostrofos) 'a' (char) // "a" (String)
		 * 
		 * para numeros inteiros
		 * byte = -128 / +127
		 * short = -32 mil / +32 mil (aproximad.)
		 * int = -2 trilhoes / +2 trilhoes (aproximad.)
		 * long = -9 trilhoes / +9 trilhoes (aproximad.)
		 * 
		 * para numeros com casas decimais
		 * float = at� umas 5 cadas decimais, deve atender
		 * double = possui o dobro de precisao em rela��o ao float
		 * 
		 * interfere na aloca��o de memoria
		 */
		
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
		float ftgs = salario * (float) 0.08;  // usando casa decimal, o java vai achar q � double, mas o (float) indica para desconsiderar - casting
		
		int numero = 5;
		byte resultado = (byte) (numero + 2);  // casting - indicando que um tipo int + 2 vai caber no byte
				
		/*
		 * Classes Wrappers (sao classes que servem para apoiar os tipos primitivos)
		 * int => Integer
		 * float => Float
		 * boolean => Boolean
		 * double => Double
		 */
		
		
		
		
	}
}
