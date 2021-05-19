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

import br.com.itau.dao.ArtistaDAO;
import br.com.itau.modelo.Artista;

@RestController
@CrossOrigin("*")
public class ArtistaController {

	@Autowired
	private ArtistaDAO dao;
	
	//gravar um artista
	@PostMapping("/novoartista")
	public ResponseEntity<Artista> add(@RequestBody Artista objeto) {
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	//retorna todos os artistas
	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> getAll(){
		List<Artista> lista = (List<Artista>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	//retorna lista de artistas da nacionalidade informada
	@GetMapping("/artistagetnac/{nac}")
	public ResponseEntity<List<Artista>> getArtistNac(@PathVariable String nac) {
		List<Artista> lista = dao.findByNacionalidade(nac);
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	//retorna o artista pelo Id
	@GetMapping("/artistagetid/{cod}")
	public ResponseEntity<Artista> getArtistId(@PathVariable int cod) {
		Artista resposta = dao.findById(cod).orElse(new Artista());
		if (resposta.getId()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	//retorna o artista pelo nome - podendo ser somente o inicio do nome
	@GetMapping("/artistagetnome/{name}")
	public ResponseEntity<List<Artista>> getArtistNome(@PathVariable String name) {
		List<Artista> lista = dao.findByNomeArtisticoLike(name + "%");
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);	
	}
	
	//exclui o artista pelo Id
	@PostMapping("/delartistid")
	public ResponseEntity<Boolean> delete(@RequestBody Artista objeto) {
		try {
			dao.deleteById(objeto.getId());
			return ResponseEntity.ok(true);
		}catch(Exception e) {
			return ResponseEntity.status(403).build();
			//return ResponseEntity.ok(false);
		}
	}
	
	
	
	
	
	
	
	
}
