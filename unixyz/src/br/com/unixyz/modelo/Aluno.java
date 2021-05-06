package br.com.unixyz.modelo;

/*
 * Design Pattern - compilado de padroes de projetos para OO
 * Um dos padroes � o DTO (Data Transfer Object) cuja fun��o � aplicar boa pr�tica na transi��o entre o projeto e a programa��o.
 * Sugest�es:
 * 1o TODOS os atributos devem estar como privados
 * 2o Cada atributo deve possuir um m�todo para o input (set) e outro m�todo para o output (get)
 * 3o ?????
 * 
 */

public class Aluno {

	private int rm;
	private String nome;
	private String email;
	private String fone;
	private String cpf;

	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		return  "Nome..: " + nome + "\n" +
				"Email.: " + email + "\n" +
				"RM....: " + rm + "\n" +
				"Fone..: " + fone + "\n" +
				"CPF...: " + cpf;
	}


	public void setBasico(String nome, int rm) {
		this.nome = nome;
		this.rm = rm;		
	}

	public String getResumo() {
		return "Nome.: " + nome + "\n" +
				"RM...: " + rm;
	}

	public String getUsuario() {
		return email.substring(0, email.indexOf("@"));
	}
}
