package br.com.angelotreptow.cofrinho.model;

public class Euro extends Moeda {

	private static final double TAXA = 6.0;

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.printf("Euro: %.2f%n", getValor());
	}

	@Override
	public double converter() {
		return getValor() * TAXA;
	}

}
