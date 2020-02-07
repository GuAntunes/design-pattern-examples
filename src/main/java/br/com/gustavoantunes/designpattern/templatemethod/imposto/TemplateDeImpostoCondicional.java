package br.com.gustavoantunes.designpattern.templatemethod.imposto;

import br.com.gustavoantunes.designpattern.strategy.imposto.Imposto;
import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
