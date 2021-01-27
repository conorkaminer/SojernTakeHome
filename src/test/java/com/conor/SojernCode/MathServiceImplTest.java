package com.conor.SojernCode;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MathServiceImplTest {

    MathServiceImpl mathService = new MathServiceImpl();

    @Test
    public void testMedianOdd() {

        List<BigDecimal> numbers = new ArrayList<>();
        numbers.add(new BigDecimal("10"));
        numbers.add(new BigDecimal("30"));
        numbers.add(new BigDecimal("20"));

        BigDecimal median = mathService.median(numbers);
        assert(new BigDecimal("20").compareTo(median) == 0);
    }

    @Test
    public void testMedianEven() {

        List<BigDecimal> numbers = new ArrayList<>();
        numbers.add(new BigDecimal("30"));
        numbers.add(new BigDecimal("10"));
        numbers.add(new BigDecimal("20"));
        numbers.add(new BigDecimal("40"));

        BigDecimal median = mathService.median(numbers);
        assert(new BigDecimal("25").compareTo(median) == 0);
    }

    @Test
    public void testMin() {

        List<BigDecimal> numbers = new ArrayList<>();
        numbers.add(new BigDecimal("30"));
        numbers.add(new BigDecimal("10.22"));
        numbers.add(new BigDecimal("20"));
        numbers.add(new BigDecimal("40"));

        BigDecimal min = mathService.min(numbers);
        assert(new BigDecimal("10.220").compareTo(min) == 0);
    }

    @Test
    public void testMax() {

        List<BigDecimal> numbers = new ArrayList<>();
        numbers.add(new BigDecimal("30"));
        numbers.add(new BigDecimal("10.22"));
        numbers.add(new BigDecimal("20"));
        numbers.add(new BigDecimal("40"));

        BigDecimal max = mathService.max(numbers);
        assert(new BigDecimal("40").compareTo(max) == 0);
    }

    @Test
    public void testAvg() {

        List<BigDecimal> numbers = new ArrayList<>();
        numbers.add(new BigDecimal("30"));
        numbers.add(new BigDecimal("10"));
        numbers.add(new BigDecimal("20"));
        numbers.add(new BigDecimal("40"));

        BigDecimal avg = mathService.avg(numbers);
        assert(new BigDecimal("25").compareTo(avg) == 0);
    }

    @Test
    public void testPercentile() {

        List<BigDecimal> numbers = new ArrayList<>();
        numbers.add(new BigDecimal("30"));
        numbers.add(new BigDecimal("10"));
        numbers.add(new BigDecimal("20"));

        BigDecimal percentile = mathService.percentile(numbers, new BigDecimal("0.5"));
        assert(new BigDecimal("20").compareTo(percentile) == 0);
    }

    @Test
    public void testPercentileOne() {

        List<BigDecimal> numbers = new ArrayList<>();
        numbers.add(new BigDecimal("30"));
        numbers.add(new BigDecimal("10"));
        numbers.add(new BigDecimal("20"));

        BigDecimal percentile = mathService.percentile(numbers, BigDecimal.ONE);
        assert(new BigDecimal("30").compareTo(percentile) == 0);
    }

    @Test
    public void testPercentileZero() {

        List<BigDecimal> numbers = new ArrayList<>();
        numbers.add(new BigDecimal("30"));
        numbers.add(new BigDecimal("10"));
        numbers.add(new BigDecimal("20"));

        BigDecimal percentile = mathService.percentile(numbers, BigDecimal.ZERO);
        assert(new BigDecimal("10").compareTo(percentile) == 0);
    }

}
