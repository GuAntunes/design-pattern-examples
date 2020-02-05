package br.com.gustavoantunes.designpattern.strategy.investimento;

public class Conservador implements Investimento{

	@Override
	public double calcula(ContaBancaria contaBancaria) {
		return contaBancaria.getValor() * 0.008;
	}

}
