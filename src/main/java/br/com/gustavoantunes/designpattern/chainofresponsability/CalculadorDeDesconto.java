package br.com.gustavoantunes.designpattern.chainofresponsability;

import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto semDesconto = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(semDesconto);
		
		return d1.desconta(orcamento);
	}
	
}
