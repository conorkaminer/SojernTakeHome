package com.conor.SojernCode;

import java.math.BigDecimal;
import java.util.List;

public interface MathService {

    BigDecimal min(List<BigDecimal> numbers);

    BigDecimal max(List<BigDecimal> numbers);

    BigDecimal avg(List<BigDecimal> numbers);

    BigDecimal median(List<BigDecimal> numbers);

    BigDecimal percentile(List<BigDecimal> numbers, BigDecimal q);

}
