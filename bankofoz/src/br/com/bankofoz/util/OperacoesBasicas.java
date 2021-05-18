package br.com.bankofoz.util;

public interface OperacoesBasicas {

	public boolean add();
	public void excluir(int id);
	public String getResumo();
	
	//a partir do java 8 é permitido programar dentro da interface, mas ainda não há uma definição do 
	// que seria melhor programar aqui ou não.
	
	
}
