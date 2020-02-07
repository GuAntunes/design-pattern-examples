package br.com.gustavoantunes.designpattern.templatemethod.relatorio;

import java.util.Date;
import java.util.List;

import br.com.gustavoantunes.designpattern.chainofresponsability.conta.Conta;

public class RelatorioComplexo extends RelatorioTemplateMethod {

	@Override
	protected void cabecalho() {
		System.out.println("Itaú Unibanco - 0800-123456 - Rua ana neri");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		contas.forEach(c -> {
			System.out.println("Titular: " + c.getTitular());
			System.out.println("Saldo: " + c.getSaldo());
			System.out.println("Agencia: " + c.getAgencia());
			System.out.println("Saldo: " + c.getNumeroDaConta());
		});

	}

	@Override
	protected void rodape() {
		System.out.println("itau-unibanco@itau.com - " + new Date());
	}

}
