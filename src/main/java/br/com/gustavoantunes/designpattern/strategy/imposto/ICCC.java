package br.com.gustavoantunes.designpattern.strategy.imposto;

public class ICCC implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() < 1000 ? orcamento.getValor() * 0.05 : 
			orcamento.getValor() >= 1000 && orcamento.getValor() <3000 ? orcamento.getValor() * 0.07 : orcamento.getValor() * 0.08;
	}

}
