package br.com.angelotreptow.cofrinho.model;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.printf("Real: %.2f%n", getValor());
	}

	@Override
	public double converter() {
		return getValor();
	}
}
