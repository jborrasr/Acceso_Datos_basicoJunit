package org.iesch.ad.junitbasico;

import java.math.BigDecimal;

public class MoneyUtil {

    public static String format(double money){
        String simbolo = "$";
        return format(money,simbolo);

    }

    public static String format(double money, String symbol){
        String simbolo = symbol;

        if (money < 0) {
            simbolo = "-" + symbol;
            money = money * (-1);

        }
        BigDecimal rounded = BigDecimal.valueOf(money).setScale(2, BigDecimal.ROUND_HALF_UP);
        return symbol + rounded;
    }



}
