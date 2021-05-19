package br.com.itau.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity  // fala pro SpringBoot que esta classe possui uma tabela correspondente no BD
@Table(name="TB_ARTISTA")  // identifica qual é a tabela que estará associada com a classe Usuario

public class Artista {

	@Id  // avisa o SpringBoot que esta coluna é chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // Identity => representa o auto incremento do BD
	@Column(name="id")
	private int id;
	
	@Column(name="nomeArtistico", length=50)  //nesse caso ele cria coluna como nome_artistico
	private String nomeArtistico;
	
	@Column(name="nacionalidade", length=20)
	private String nacionalidade;
	
	@Column(name="estilo", length=20)
	private String estilo;
	
	@OneToMany(mappedBy="artista", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("artista")  // ignora para nao entrar em looping na pesquisa de artistas
	private List<Musica> musicas;
	
	

	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeArtistico() {
		return nomeArtistico;
	}

	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}



	public Artista() {
		super();
	}

	public Artista(int id, String nomeArtistico, String nacionalidade, String estilo, List<Musica> musicas) {
		super();
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
		this.estilo = estilo;
		this.musicas = musicas;
	}

	@Override
	public String toString() {
		return "Artista [id=" + id + ", nomeArtistico=" + nomeArtistico + ", nacionalidade=" + nacionalidade
				+ ", estilo=" + estilo + ", musicas=" + musicas + "]";
	}


	
	
	
}
