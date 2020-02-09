package br.com.gustavoantunes.designpattern.builder.notafiscal;

public class TesteNotaFiscal {
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder()
		.paraEmpresa("Gustavo Soluções")
		.comCNPJ("12.345.678/0001-12")
		.comItem(new ItemDaNota("Item 1", 200.0))
		.comItem(new ItemDaNota("Item 2", 300.0))
		.comObservacao("observações");
		
		NotaFiscal nf = builder.constroi();	
		
		System.out.println(nf.getValorBruto());
	}
}
