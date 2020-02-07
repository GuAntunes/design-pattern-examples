package br.com.gustavoantunes.designpattern.templatemethod.imposto;

import java.util.ArrayList;
import java.util.List;

import br.com.gustavoantunes.designpattern.chainofresponsability.Item;
import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (orcamento.getItens().size() * 0.01);
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return 100 + orcamento.getValor() * 0.13;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();

		for (Item item : orcamento.getItens()) {
			if (noOrcamento.contains(item.getNome()))
				return true;
			else
				noOrcamento.add(item.getNome());
		}

		return false;
	}

}
