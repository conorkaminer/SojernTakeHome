package com.conor.SojernCode;


import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;

public class VersionCompare {

    @Inject
    private MathService mathService;

    public Integer compareVersions(String a, String b) {
        String[] aSplit = StringUtils.split(a,  ".");
        String[] bSplit = StringUtils.split(b, ".");

        Integer length = min(aSplit.length, bSplit.length);

        for (int i = 0; i < length; i++) {
            Integer aNum;
            Integer bNum;
            try {
                aNum = Integer.valueOf(aSplit[i]);
                bNum = Integer.valueOf(bSplit[i]);
            } catch (NumberFormatException e) {
                return null;
            }

            if (aNum > bNum) {
                return 1;
            } else if (bNum > aNum) {
                return -1;
            }
        }

        if (aSplit.length > bSplit.length) {
            return 1;
        } else if (bSplit.length > aSplit.length) {
            return -1;
        }

        return 0;
    }

    private int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }
}
