package com.conor.SojernCode;

import org.junit.jupiter.api.Test;

public class VersionCompareTest {

    VersionCompare compare = new VersionCompare();

    @Test
    public void testEqual() {
        assert(compare.compareVersions("1.2.3", "1.2.3") == 0);
    }

    @Test
    public void testSameLengthLess() {
        assert(compare.compareVersions("1.2.13", "1.3.3") == -1);
    }

    @Test
    public void testSameLengthMore() {
        assert(compare.compareVersions("1.2.3", "1.1.13") == 1);
    }

    @Test
    public void testDiffLengthMore() {
        assert(compare.compareVersions("1.2.3.4", "1.2.3") == 1);
    }

    @Test
    public void testDiffLengthLess() {
        assert(compare.compareVersions("1.2.3.4", "1.12.3") == -1);
    }

    @Test
    public void testDiffLength() {
        assert(compare.compareVersions("1.2.3", "1.1.3.50") == 1);

    }

    @Test
    public void testDiffLengthZeros() {
        assert(compare.compareVersions("1.2.3.0", "1.2.3") == 1);
    }

    @Test
    public void testBadString() {
        assert(compare.compareVersions("1.a.3", "1.2.4") == null);
    }
}
