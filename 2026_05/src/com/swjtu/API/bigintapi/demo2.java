package com.swjtu.API.bigintapi;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class demo2 {
    public static void main(String[] args) {

        BigDecimal bd = new BigDecimal(0.99);
        BigDecimal bd2 = new BigDecimal("0.99");
        BigDecimal bd3 = BigDecimal.valueOf(0.99);
        System.out.println(bd);
        System.out.println(bd2);
        System.out.println(bd3);
        BigDecimal a = BigDecimal.valueOf(3.0);
        BigDecimal b = BigDecimal.valueOf(10.0);
        BigDecimal c = a.divide(b,3, RoundingMode.HALF_UP);
        System.out.println(c);
    }
}
