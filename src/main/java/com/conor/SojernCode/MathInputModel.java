package com.conor.SojernCode;

import java.math.BigDecimal;
import java.util.List;

public class MathInputModel {
    List<BigDecimal> numbers;
    BigDecimal q;

    public List<BigDecimal> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<BigDecimal> numbers) {
        this.numbers = numbers;
    }

    public BigDecimal getQ() {
        return q;
    }

    public void setQ(BigDecimal q) {
        this.q = q;
    }
}
