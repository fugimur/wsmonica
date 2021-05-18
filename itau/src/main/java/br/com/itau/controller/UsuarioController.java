package br.com.itau.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.dao.UsuarioDAO;
import br.com.itau.modelo.Usuario;

@RestController  //para indicar ao SpringBoot que esta classe ira responder metodos do HTTP
@CrossOrigin("*")  //para liberar o acesso fora do servidor à estes recursos
public class UsuarioController {
	
	@Autowired  //delega para o SpringBoot o gerenciamento desse atributo
	private UsuarioDAO dao;
	
	//retorna usuario pelo id - info está 'fora do envelope'
	//qdo usamos o get, não usamos o body, e sim o dado no caminho do endereço
	//o get é muito mais simples para o frontend executar
	@GetMapping("/userget/{cod}")
	public Usuario getUserGet(@PathVariable int cod) {
		Usuario resposta = dao.findById(cod).orElse(new Usuario());
		resposta.setSenha("");
		return resposta;
	}
	
	//retorna usuario pelo id - info está 'dentro do envelope'
	@PostMapping("/userpost")
	public Usuario getUserPost(@RequestBody Usuario objeto) {
		Usuario resposta = dao.findById(objeto.getId()).orElse(new Usuario());  //se nao encontrar, retorna nulo
		resposta.setSenha("");  //para nao mostrar a senha
		return resposta;
	}
	
	//cadastra novo usuario
	@PostMapping("/novousuario")
	public Usuario add(@RequestBody Usuario objeto) {
		dao.save(objeto);
		return objeto;
	}
	
	//retorna lista de usuarios
	@GetMapping("/users")
	public List<Usuario> getAll(){
		List<Usuario> lista = (List<Usuario>) dao.findAll();
		return lista;
	}

}
