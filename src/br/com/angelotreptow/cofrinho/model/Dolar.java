package br.com.angelotreptow.cofrinho.model;

public class Dolar extends Moeda {

	private static final double TAXA = 5.0;

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.printf("Dolar: %.2f%n", getValor());
	}

	@Override
	public double converter() {
		return getValor() * TAXA;
	}

}
