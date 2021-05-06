package br.com.rubinhocar.modelo;

public class Veiculo {
	// nao tem o modo main pq é só um modelo

	private float valor;
	private String modelo;
	private String montadora;

	// <modificador> <tipo do retorno> <nome do metodo> (<tipo do param> <nome do param>)

	// MODELO

	public void preencherModelo(String param) {
		if (param.length()<=40) {
			modelo = param.toUpperCase();
		}
	}
	public String retornarModelo() {
		return modelo;
	}

	// VALOR
	public void preencherValor(float param) {
		if (param>0) {
			valor = param;
		}
	}
	public float retornarValor() {
		return valor;
	}

	// MONTADORA
	public void preencherMontadora(String param) {
		if (param.length()<=30) {
			montadora = param.toUpperCase();
		}
	}
	public String retornarMontadora() {
		return montadora;
	}

	// TUDO
	public void preencherTudo(float pValor, String pModelo, String pMontadora) {
		valor = pValor;
		modelo = pModelo;
		montadora = pMontadora;
	}
	public String retornarTudo() {
		// só pode ter 1 return
		return "Modelo....: " + modelo + "\n" +
			   "Montadora.: " + montadora + "\n" +
			   "Valor.....: " + valor;
	}

	// DESCONTO - valor menos 10%
	public float retornarDesconto() {
		return valor * (float) 0.9;
	}




}

