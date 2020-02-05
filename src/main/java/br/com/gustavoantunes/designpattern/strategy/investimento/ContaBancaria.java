package br.com.gustavoantunes.designpattern.strategy.investimento;

public class ContaBancaria {

	private double valor;

	public double getValor() {
		return valor;
	}

	public void deposita(double valor) {
		this.valor += valor;
	}
	
}
