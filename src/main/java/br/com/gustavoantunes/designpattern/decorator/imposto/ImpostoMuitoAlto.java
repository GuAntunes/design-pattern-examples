package br.com.gustavoantunes.designpattern.decorator.imposto;

import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

    public ImpostoMuitoAlto(Imposto imposto) {
        super(imposto);
    }

    public ImpostoMuitoAlto() {
        super();
    }

	@Override
	protected double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + this.calculoDoOutroImposto(orcamento); 
	}

}
