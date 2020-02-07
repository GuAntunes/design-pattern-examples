package br.com.gustavoantunes.designpattern.templatemethod.relatorio;

import java.util.List;

import br.com.gustavoantunes.designpattern.chainofresponsability.conta.Conta;

public abstract class RelatorioTemplateMethod implements Relatorio {

	@Override
	public void gerar(List<Conta> contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}

	protected abstract void cabecalho();

	protected abstract void corpo(List<Conta> contas);

	protected abstract void rodape();

}
