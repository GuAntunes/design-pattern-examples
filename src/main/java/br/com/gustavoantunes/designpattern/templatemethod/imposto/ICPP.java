package br.com.gustavoantunes.designpattern.templatemethod.imposto;

import br.com.gustavoantunes.designpattern.chainofresponsability.Item;
import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100)
				return true;
		}
		return false;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}
}
