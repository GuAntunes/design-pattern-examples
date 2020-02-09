package br.com.gustavoantunes.designpattern.state;

import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

 public class Reprovado implements EstadoDeUmOrcamento { 
    public void aplicaDescontoExtra(Orcamento orcamento) {
      throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
    }

	@Override
	public void aprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		// TODO Auto-generated method stub
		
	}
  }
