package br.com.gustavoantunes.designpattern.observer.notafiscal;

import br.com.gustavoantunes.designpattern.builder.notafiscal.NotaFiscal;

public class Impressora implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Nota Impressa");
	}
}
