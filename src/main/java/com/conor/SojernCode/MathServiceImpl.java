package com.conor.SojernCode;

import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class MathServiceImpl implements MathService {

    @Override
    public BigDecimal min(List<BigDecimal> numbers) {
        if (CollectionUtils.isEmpty(numbers)) {
            return null;
        }
        BigDecimal min = numbers.get(0);
        for (BigDecimal numb : numbers) {
            if (numb.compareTo(min) < 0) {
                min = numb;
            }
        }
        return min;
    }

    @Override
    public BigDecimal max(List<BigDecimal> numbers) {
        if (CollectionUtils.isEmpty(numbers)) {
            return null;
        }
        BigDecimal max = numbers.get(0);
        for (BigDecimal numb : numbers) {
            if (numb.compareTo(max) > 0) {
                max = numb;
            }
        }
        return max;
    }

    @Override
    public BigDecimal avg(List<BigDecimal> numbers) {
        if (CollectionUtils.isEmpty(numbers)) {
            return null;
        }
        BigDecimal total = BigDecimal.ZERO;
        for (BigDecimal numb : numbers) {
            total = total.add(numb);
        }
        return total.divide(new BigDecimal(numbers.size()));
    }

    @Override
    public BigDecimal median(List<BigDecimal> numbers) {
        if (CollectionUtils.isEmpty(numbers)) {
            return null;
        }
        numbers.sort(BigDecimal::compareTo);
        if (numbers.size() % 2 == 1) {
            return numbers.get(((numbers.size() + 1) / 2) - 1);
        } else {
            BigDecimal res = numbers.get((numbers.size() / 2) - 1);
            res = res.add(numbers.get((numbers.size() / 2)));
            return res.divide(new BigDecimal(2));
        }
    }

    @Override
    public BigDecimal percentile(List<BigDecimal> numbers, BigDecimal q) {
        if (CollectionUtils.isEmpty(numbers) || q == null) {
            return null;
        } else if (q.compareTo(BigDecimal.ONE) > 0 || q.compareTo(BigDecimal.ZERO) < 0) {
            return null;
        } else if (q.compareTo(BigDecimal.ZERO) == 0) {
            return min(numbers);
        }
        numbers.sort(BigDecimal::compareTo);

        BigDecimal index = q.multiply(new BigDecimal(numbers.size()));
        index = index.setScale(0, RoundingMode.HALF_UP).subtract(BigDecimal.ONE);
        return numbers.get(index.intValue());
    }
}
