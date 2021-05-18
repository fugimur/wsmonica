package br.com.urnaeletronica.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.bankofoz.util.Magic;
import br.com.urnaeletronica.beans.Urna;
import br.com.urnaeletronica.beans.Voto;
import br.com.urnaeletronica.beans.VotoReduzido;

public class ImplementarUrna {

	public static void main(String[] args) {
		
		Urna urna = new Urna();
		urna.setSecao(Magic.i("Secao"));
		urna.setZona(Magic.i("Zona"));
		//urna.setVotos(votos);

		List<Voto> lista = new ArrayList<Voto>();
		do {
			lista.add(new Voto(
					Magic.i("Titulo"),
					Magic.s("Candidato"),
					Magic.s("Cargo"),
					(byte) Magic.i("Turno")
					));
		}while(Magic.b("Continuar?")==true);
		
		urna.setVotos(lista);
		
		// a partir daqui temos uma urna
		
		int totturno1=0;
		int qtdeXPTO=0;
		int qtdeVereador=0;
		List<VotoReduzido> resultado = new ArrayList<VotoReduzido>();
		
		for (Voto voto : urna.getVotos()) {
			resultado.add(new VotoReduzido(voto.getCandidato(), voto.getTitulo()));
			System.out.println("Titulo: " + voto.getTitulo());
			System.out.println("Candidato: " + voto.getCandidato());
			System.out.println("Cargo: " + voto.getCargo());
			System.out.println("Turno: " + voto.getTurno());
			System.out.println("===========================");
			
			if (voto.getTurno()==1) {
				totturno1++;
			}
			if (voto.getCandidato().equalsIgnoreCase("XPTO")) {
				qtdeXPTO++;
			}
			if (voto.getCargo().equalsIgnoreCase("vereador")) {
				qtdeVereador++;
			}
		}
		
		System.out.println("Total votos Turno 1: " + totturno1);
		System.out.println(("Qtde votos XPTO: " + qtdeXPTO));
		System.out.println("Qtde votos vereador: " + qtdeVereador);
		System.out.println("Qtde votos urna: " + urna.getVotos().size());
		System.out.println("Votos Reduzidos: " + resultado);
		

	}

}
