package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		
		String email = "mOnicAfitau.com.br";
		System.out.println("Original: " + email);
		System.out.println("Minusculo: " + email.toLowerCase());     // apresenta em minuscula, mas nao altera a variavel
		System.out.println("Maiusculo: " + email.toUpperCase());     // apresenta em maiuscula
		System.out.println("Qtde de Caracteres " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));    // pode ser colocada uma parte da string, nao necessariamente apenas 1 caracter
		System.out.println("Posi��o do @: " + email.indexOf("@"));   // o 1o byte � a posi��o 0 - se nao encontrar, retorna -1
		System.out.println("Do 3o at� o 5o: " + email.substring(2,5));   // lembrando que come�a no 0 e a ult coordenada nao � mostrada
		System.out.println("Do 3o at� o fim: " + email.substring(2));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2)); // mesmo q o tamanho seja impar, retorna inteiro
		System.out.println("Usuario: " + email.substring(0, email.indexOf("@")).toLowerCase());
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1).toUpperCase());
		System.out.println("Primeiro Caracter: " + email.charAt(0));   // pega o 1o caracter e retorno do tipo char
		System.out.println("� igual? " + email.equals("mOnicAf@itau.com.br"));   // compara caracter e � case sensitive
			
		
		//      m o n i c a @ i t a
		// (-1) 0 1 2 3 4 5 6 7 8 9 ...
		
				
		/*
		 * churros => variavel
		 * churros() => fun��o
		 * Abc.churros() => m�todo
		 * Churros => classe
		 */
		
		
		
	}
	
}
