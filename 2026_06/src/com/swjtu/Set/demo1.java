package com.swjtu.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class demo1 {
    static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("aaa");
        s1.add("bbb");
        s1.add("ccc");
        System.out.println(s1.add("aaa"));
        System.out.println(s1);
        System.out.println("------------------------------");


        Iterator<String> ite = s1.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
        System.out.println("------------------------------");

        for (String s : s1) {
            System.out.println(s);
        }
    }
}
