package br.com.gustavoantunes.designpattern.chainofresponsability;

import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);
	void setProximo(Desconto desconto);
}
