package br.com.gustavoantunes.designpattern.templatemethod.relatorio;

import java.util.List;

import br.com.gustavoantunes.designpattern.chainofresponsability.conta.Conta;

public interface Relatorio {

	void gerar(List<Conta> contas);
}
