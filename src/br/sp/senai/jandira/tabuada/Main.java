package br.sp.senai.jandira.tabuada;

import br.sp.senai.jandira.tabuada.gui.TelaTabuada;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		double notas[] = new double[5];
//		notas[0] = 9.8;
//		notas[1] = 9.9;
//		notas[2] = 7.6;
//		notas[3] = 8.9;
//		
//		int tamanho = notas.length;
//		
//		int contador = 0;
//		double total = 0.0;
//		while(contador < tamanho) {
//			System.out.println(notas[contador]);
//			total += notas[contador];
//			contador++;
//		}
//		
//		double media = total / tamanho;
//		System.out.println("Média Final: " + media);

		TelaTabuada tela = new TelaTabuada();
		tela.criarTela();
		
	}
}
