package br.com.angelotreptow.cofrinho.model;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {

	private List<Moeda> listaMoedas;

	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}

	public void adicionar(Moeda moeda) {
			listaMoedas.add(moeda);
	}

	public void remover(Moeda moeda) {
	    boolean removida = listaMoedas.remove(moeda);

	    if (!removida) {
	        throw new IllegalArgumentException("Moeda não encontrada");
	    }
	}

	public void listagemMoedas() {
		for (Moeda moeda : listaMoedas) {
			moeda.info();
		}
	}

	public double totalConvertido() {
		double total = 0;
		for (Moeda moeda : listaMoedas) {
			total += moeda.converter();
		}
		return total;
	}

}
