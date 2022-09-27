package org.iesch.ad.junitbasico;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyUtilTest {
    @Test
    void format(){
        String money = MoneyUtil.format(1000);
        assertEquals("$1000.00", money);
    }
}