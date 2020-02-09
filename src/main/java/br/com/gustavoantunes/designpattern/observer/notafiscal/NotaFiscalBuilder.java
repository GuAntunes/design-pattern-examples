package br.com.gustavoantunes.designpattern.observer.notafiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.gustavoantunes.designpattern.builder.notafiscal.ItemDaNota;
import br.com.gustavoantunes.designpattern.builder.notafiscal.NotaFiscal;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<>();
	private double valorBruto;
	private double impostos;
	private String observacao;
	private Calendar data;
	private List<AcaoAposGerarNota> acoes = new ArrayList<>();
	

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCNPJ(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comObservacao(String obs) {
		this.observacao = obs;
		return this;
	}

	public NotaFiscalBuilder naDataAtual() {
		this.data = Calendar.getInstance();
		return this;
	}

	public NotaFiscal constroi() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacao);
		
		acoes.forEach(a -> {
			a.executa(nf);
		});
		
		return nf;
	}
	
	public void adicionaAcao(AcaoAposGerarNota acao) {
		acoes.add(acao);
	}



}
