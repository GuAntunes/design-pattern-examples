package br.com.gustavoantunes.designpattern.decorator.imposto;

import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

public class ISS extends Imposto {

	public ISS() {
	}
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 ;
	}

}
