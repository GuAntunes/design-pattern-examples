package br.com.gustavoantunes.designpattern.state;

import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.setValor(orcamento.getValor() * 0.02);
	}

	public void aprova(Orcamento orcamento) {
		// jah estou em aprovacao
		throw new RuntimeException("Orçamento já está em estado de aprovação");
	}

	public void reprova(Orcamento orcamento) {
		// nao pode ser reprovado agora!
		throw new RuntimeException("Orçamento está em estado de aprovação e não pode ser reprovado");
	}

	public void finaliza(Orcamento orcamento) {
		// daqui posso ir para o estado de finalizado
		orcamento.setEstadoAtual(new Finalizado());
	}
}