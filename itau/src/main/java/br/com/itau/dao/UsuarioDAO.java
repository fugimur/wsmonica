package br.com.itau.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.modelo.Usuario;

/*
 * DAO => é um pattern que sugestiona onde devem ficar os comandos SQL DML
 * Dentro das classes DAO´s:
 * Deve montar o CRUD (Creaate - Read - Update - Delete)
 * 
 */
public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{

	//Nesse caso o SpringBoot já entende que cada palavra iniciada por palavra maiuscula é o atributo que ele vai usar
	public Usuario findByEmailAndSenha(String email, String senha);
	
/*
 * CrudRepository será a classe pai do UsuarioDAO e está informando ao SpringBoot
 * que esta classe armazenará o CRUD para usuario. O Integer é para especificar
 * que o tipo de dado da chave primária é Integer.
 * Sintaxe: modelo, tipo do dado
 */
	/*
	 * Métodos herdados do CrudRepository:
	 * - save (objeto): grava/altera uma linha no banco de dados
	 * - findById(int): pesquisa um usuario pelo codigo
	 * - findAll(): retorna todos os usuarios 
	 * - deleteById(int): apaga um usuário pelo codigo
	 * - deleteAll(): apaga tudo
	 * - count(): retorna qtos usuarios existem
	 */
	
	
	
	
	
	
	
}
