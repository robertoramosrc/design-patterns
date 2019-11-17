package br.com.beta1;

import br.com.beta1.model.CalculadoraDeImpostos;
import br.com.beta1.model.ICMS;
import br.com.beta1.model.ISS;
import br.com.beta1.model.Orcamento;

import java.math.BigDecimal;

public class Programa {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(2300.28));

        System.out.println("Orçamento de ".concat(String.valueOf(orcamento.getValor())));

        exibeValorICMS(orcamento);
        exibeValorISS(orcamento);

    }

    private static void exibeValorISS(Orcamento orcamento) {
        System.out.println(new StringBuffer()
                .append("Valor de ISS: ")
                .append(new CalculadoraDeImpostos().calculaImposto(orcamento, new ICMS()))
                .toString());
    }

    private static void exibeValorICMS(Orcamento orcamento) {

        System.out.println(new StringBuffer()
                .append("Valor de ICMS: ")
                .append(new CalculadoraDeImpostos().calculaImposto(orcamento, new ISS()))
                .toString());

    }

}
