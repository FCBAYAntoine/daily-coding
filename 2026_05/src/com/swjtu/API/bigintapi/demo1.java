package com.swjtu.API.bigintapi;

import java.util.Random;
import java.math.BigInteger;
public class demo1 {
    public static void main(String[] args) {
        Random r = new Random();
        BigInteger a = new BigInteger(5,r);
        System.out.println(a);
        System.out.println(BigInteger.valueOf(66));
    }
}
