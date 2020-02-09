package br.com.gustavoantunes.designpattern.observer.notafiscal;

import br.com.gustavoantunes.designpattern.builder.notafiscal.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Nota enviada por email");
		// TODO Auto-generated method stub

	}
}
