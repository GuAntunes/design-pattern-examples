package br.com.gustavoantunes.designpattern.strategy.investimento;

public class Moderado implements Investimento{

	@Override
	public double calcula(ContaBancaria contaBancaria) {
		return contaBancaria.getValor() * 0.025;
	}

}
