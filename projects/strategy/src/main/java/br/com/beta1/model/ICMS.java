package br.com.beta1.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ICMS implements InterfaceImposto {

    private static final BigDecimal ALIQUOTA_ICMS = BigDecimal.valueOf(0.16);

    @Override
    public BigDecimal calculaImposto(BigDecimal valorBase) {
        return valorBase.multiply(ALIQUOTA_ICMS).setScale(2, RoundingMode.HALF_UP);
    }

}
