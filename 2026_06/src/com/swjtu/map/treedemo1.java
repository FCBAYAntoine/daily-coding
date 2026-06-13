package com.swjtu.map;

import java.util.Comparator;
import java.util.TreeMap;

public class treedemo1 {
    static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        tm.put(3,"张三");
        tm.put(2,"李四");
        tm.put(3,"王五");
        System.out.println(tm);
    }
}
