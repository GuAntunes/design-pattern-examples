package br.com.gustavoantunes.designpattern.state;

import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

public interface EstadoDeUmOrcamento {
	 void aplicaDescontoExtra(Orcamento orcamento);
     void aprova(Orcamento orcamento);
     void reprova(Orcamento orcamento);
     void finaliza(Orcamento orcamento);
}