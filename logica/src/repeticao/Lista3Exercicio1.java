package repeticao;

import javax.swing.JOptionPane;

public class Lista3Exercicio1 {

	public static void main(String[] args) {
		byte idade=99;
		char sexo=1;
		char exper=1;
		int contFemExp=0;
		int contFemExpN=0;
		int contMasExp=0;
		int contMasExpN=0;

		do {
			idade = Byte.parseByte(JOptionPane.showInputDialog("Digite sua idade"));
			sexo = JOptionPane.showInputDialog("Sexo: \n<M> Masculino\n<F> Feminino").charAt(0);
			exper = JOptionPane.showInputDialog("ExperiÍncia: \n<S> Sim\n<N> N„o").charAt(0);

			if (sexo=='F') {  // feminio
				if (exper=='S') {
					contFemExp++;
				}
				else {
					contFemExpN++;
				}				
			}
			else  {
				if (exper=='S') {
					contMasExp++;
				}
				else {
					contMasExpN++;
				}
			}
		}while (idade!=0);

		System.out.println("Candidatos sexo feminino com experiÍncia = " + contFemExp);
		System.out.println("Candidatos sexo feminino sem experiÍncia = " + contFemExpN);
		System.out.println("Candidatos sexo masculino com experiÍncia = " + contMasExp);
		System.out.println("Candidatos sexo masculino sem experiÍncia = " + contMasExpN);
	}
}