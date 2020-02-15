package br.com.beta1.model;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calculaImposto(Orcamento orcamento, InterfaceImposto imposto) {
        return imposto.calculaImposto(orcamento.getValor());
    }

}
