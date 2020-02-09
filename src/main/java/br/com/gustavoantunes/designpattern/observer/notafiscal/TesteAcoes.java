package br.com.gustavoantunes.designpattern.observer.notafiscal;

import br.com.gustavoantunes.designpattern.builder.notafiscal.ItemDaNota;

public class TesteAcoes {
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new NotaFiscalDAO());
		builder.adicionaAcao(new Impressora());
		builder.adicionaAcao(new EnviadorDeEmail());
		
		builder
		.paraEmpresa("Gustavo Soluções")
		.comCNPJ("12.345.678/0001-12")
		.comItem(new ItemDaNota("Item 1", 200.0))
		.comItem(new ItemDaNota("Item 2", 300.0))
		.comObservacao("observações");
	}
}
