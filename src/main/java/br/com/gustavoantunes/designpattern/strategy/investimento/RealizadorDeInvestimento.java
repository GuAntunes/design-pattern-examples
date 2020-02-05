package br.com.gustavoantunes.designpattern.strategy.investimento;

public class RealizadorDeInvestimento {

	public void realizaInvestimento(ContaBancaria contaBancaria, Investimento estrategia) {
		double valor = 0;
		valor = estrategia.calcula(contaBancaria);
		System.out.println(valor);

		contaBancaria.deposita(valor * 0.75);
	}

}
