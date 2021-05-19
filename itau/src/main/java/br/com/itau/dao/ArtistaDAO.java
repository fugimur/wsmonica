package br.com.itau.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.modelo.Artista;

//Sintaxe CrudRepository<modelo, tipo do dado da chave primaria>
public interface ArtistaDAO extends CrudRepository<Artista, Integer>{

	public List<Artista> findByNacionalidade(String nacionalidade);
	public List<Artista> findByNomeArtisticoLike(String nome);
}
