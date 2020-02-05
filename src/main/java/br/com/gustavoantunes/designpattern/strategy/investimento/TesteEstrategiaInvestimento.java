package br.com.gustavoantunes.designpattern.strategy.investimento;

public class TesteEstrategiaInvestimento {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		conta.deposita(5000);
		
		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		Investimento arrojado = new Arrojado();
		
		RealizadorDeInvestimento realiza = new RealizadorDeInvestimento();
		realiza.realizaInvestimento(conta, conservador);
	}
}
