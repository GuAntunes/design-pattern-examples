package br.com.gustavoantunes.designpattern.observer.notafiscal;

import br.com.gustavoantunes.designpattern.builder.notafiscal.NotaFiscal;

public interface AcaoAposGerarNota {

	void executa(NotaFiscal nf);
}
