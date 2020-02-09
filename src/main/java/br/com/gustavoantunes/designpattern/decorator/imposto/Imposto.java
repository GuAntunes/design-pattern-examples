package br.com.gustavoantunes.designpattern.decorator.imposto;

import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

public abstract class Imposto {

	protected  Imposto outroImposto ;

	public Imposto() {
	}
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

    protected double calculoDoOutroImposto(Orcamento orcamento) {
      // tratando o caso do proximo imposto nao existir!
      if(outroImposto == null) return 0;
      return outroImposto.calcula(orcamento);
    }

	protected abstract double calcula(Orcamento orcamento);

}
