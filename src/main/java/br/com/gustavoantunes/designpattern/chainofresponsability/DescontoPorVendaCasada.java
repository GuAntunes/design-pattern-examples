package br.com.gustavoantunes.designpattern.chainofresponsability;

import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

public class DescontoPorVendaCasada implements Desconto{

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if(orcamento.contemItemDeNome("Caneta") && orcamento.contemItemDeNome("Lapis")) {
			return orcamento.getValor() * 0.05;
		}
		
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
		
	}

}
