package br.com.beta1.model;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    //problema que foi refatorado
        /*if( "ICMS".equals(imposto) ) {
           double icms = new ICMS().calculaICMS(orcamento);
        } else if( "ISS".equals(imposto) ) {
            double iss = new ISS().calculaISS(orcamento);
        }*/

    public BigDecimal calculaImposto(Orcamento orcamento, InterfaceImposto imposto) {
        return imposto.calculaImposto(orcamento.getValor());
    }


}
