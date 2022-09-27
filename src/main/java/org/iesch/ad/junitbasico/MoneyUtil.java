package org.iesch.ad.junitbasico;

import java.math.BigDecimal;

public class MoneyUtil {

    public static String format(double money){
        BigDecimal rounded = BigDecimal.valueOf(money).setScale(2, BigDecimal.ROUND_HALF_UP);
        return"$" + rounded;
    }



}
