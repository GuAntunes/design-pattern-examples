package br.com.gustavoantunes.designpattern.state;

import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.setValor(orcamento.getValor() * 0.05);;
	}

	public void aprova(Orcamento orcamento) {
		// desse estado posso ir para o estado de aprovado
		orcamento.setEstadoAtual(new Aprovado()) ;
	}

	public void reprova(Orcamento orcamento) {
		// desse estado posso ir para o estado de reprovado tambem
		orcamento.setEstadoAtual(new Reprovado());
	}

	public void finaliza(Orcamento orcamento) {
		// daqui não posso ir direto para finalizado
		throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
	}
}