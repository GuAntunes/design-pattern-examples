package br.com.gustavoantunes.designpattern.templatemethod.relatorio;

import java.util.List;

import br.com.gustavoantunes.designpattern.chainofresponsability.conta.Conta;

public class RelatorioSimples extends RelatorioTemplateMethod{

	@Override
	protected void cabecalho() {
		System.out.println("Itaú Unibanco - 0800-123456");
		
	}

	@Override
	protected void corpo(List<Conta> contas) {
		contas.forEach(c -> {
			System.out.println("Titular: " + c.getTitular());
			System.out.println("Saldo: " + c.getSaldo());
		});
		
	}

	@Override
	protected void rodape() {
		System.out.println("Itaú Unibanco - 0800-123456");
	}



}
