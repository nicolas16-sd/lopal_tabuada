package br.sp.senai.jandira.tabuada.model;

public class Tabuada {
	private double minimoMultiplicador;
	private double maximoMultiplicador;
	private double multiplicando;

	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}

	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}

	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}

	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public void calcularTabuada() {

		// Verificar se os valores estão invertidos

		if (minimoMultiplicador > maximoMultiplicador) {

			double temp = minimoMultiplicador;

			minimoMultiplicador = maximoMultiplicador;

			maximoMultiplicador = temp;

		}

		// Calcular e mostrar a tabuada

		while (minimoMultiplicador <= maximoMultiplicador) {

			double produto = multiplicando * minimoMultiplicador;

			System.out.printf("%s X %s = %s\n", multiplicando, minimoMultiplicador, maximoMultiplicador, produto);

			minimoMultiplicador++;

		}

		System.out.println("FIM!");

	}

}
