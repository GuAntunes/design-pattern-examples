package br.com.gustavoantunes.designpattern.decorator.imposto;

import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

public class ICMS extends Imposto {
	
	public ICMS() {
	}
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
