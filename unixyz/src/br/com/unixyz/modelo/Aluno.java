package br.com.unixyz.modelo;

/*
 * Design Pattern - compilado de padroes de projetos para OO
 * Um dos padroes é o DTO (Data Transfer Object) cuja função é aplicar boa prática na transição entre o projeto e a programação.
 * Sugestões:
 * 1o TODOS os atributos devem estar como privados
 * 2o Cada atributo deve possuir um método para o input (set) e outro método para o output (get)
 * 3o No MINIMO 2 contrutores, sendo um vazio e outro com todos os atributos sendo preenchidos (cheio) - public Aluno()
 * 
 */

public class Aluno {

	private int rm;
	private String nome;
	private String email;
	private String fone;
	private String cpf;
	private Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Aluno [rm=" + rm + ", nome=" + nome + ", email=" + email + ", fone=" + fone + ", cpf=" + cpf
				+ ", endereco=" + endereco + "]";
	}

	// construtor cheio
	public Aluno(int rm, String nome, String email, String fone, String cpf, Endereco endereco) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.cpf = cpf;
		this.endereco = endereco;
	}


	// construtor vazio
	public Aluno() {}


	/* 
	 * construtor com 1 parametro
	public Aluno(int rm) {
		this.rm = rm;
	}

	 * construtor com 2 parametros
	public Aluno(int rm, String nome) {
		this.rm=rm;
		this.nome=nome;
	}
	 */

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
