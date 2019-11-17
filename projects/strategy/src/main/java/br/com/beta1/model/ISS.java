package br.com.beta1.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ISS implements InterfaceImposto {
    private static final BigDecimal ALIQUOTA_ISS = BigDecimal.valueOf(0.25);

    @Override
    public BigDecimal calculaImposto(BigDecimal valorBase) {
        return valorBase.multiply(ALIQUOTA_ISS).setScale(2, RoundingMode.HALF_UP);
    }
}
