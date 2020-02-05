package br.com.gustavoantunes.designpattern.chainofresponsability;

import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
		
	}

}
