package br.com.itau.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

	@PostMapping("/login2")
	public ResponseEntity<Usuario> logar2(@RequestBody Usuario objeto){
		Usuario usuario = dao.findByEmailAndSenha(objeto.getEmail(), objeto.getSenha());
		if (usuario==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(usuario);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> logar(@RequestBody Usuario objeto){
		List<Usuario> lista = (List<Usuario>) dao.findAll();
		for (Usuario usuario : lista) {
			if (usuario.getEmail().equals(objeto.getEmail()) && usuario.getSenha().equals(objeto.getSenha())) {
				return ResponseEntity.ok(usuario);
			}
		}
		return ResponseEntity.status(404).build();
	}

	//retorna usuario pelo id - info está 'fora do envelope'
	//qdo usamos o get, não usamos o body, e sim o dado no caminho do endereço
	//o get é muito mais simples para o frontend executar
	@GetMapping("/userget/{cod}")
	public ResponseEntity<Usuario> getUserGet(@PathVariable int cod) {
		Usuario resposta = dao.findById(cod).orElse(new Usuario());
		resposta.setSenha("");
		if (resposta.getId()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}

	//retorna usuario pelo id - info está 'dentro do envelope'
	@PostMapping("/userpost")
	public ResponseEntity<Usuario> getUserPost(@RequestBody Usuario objeto) {
		Usuario resposta = dao.findById(objeto.getId()).orElse(new Usuario());  //se nao encontrar, retorna nulo
		resposta.setSenha("");  //para nao mostrar a senha
		if (resposta.getId()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}

	//cadastra novo usuario
	@PostMapping("/novousuario")
	public ResponseEntity<Usuario> add(@RequestBody Usuario objeto) {
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}

	//retorna lista de usuarios
	@GetMapping("/users")
	public ResponseEntity<List<Usuario>> getAll(){
		List<Usuario> lista = (List<Usuario>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}

}
