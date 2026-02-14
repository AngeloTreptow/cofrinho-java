package br.com.angelotreptow.cofrinho.service;

import br.com.angelotreptow.cofrinho.model.*;

public class FabricaMoeda {

	public static Moeda criarMoeda(int tipo, double valor) {
	    switch (tipo) {
	        case 1: return new Real(valor);
	        case 2: return new Dolar(valor);
	        case 3: return new Euro(valor);
	        default:
	            throw new IllegalArgumentException("Tipo inválido");
			}
		}

		public static void validarMoeda(int tipo) {
			criarMoeda(tipo, 0);
		}
	}
