package com.swjtu.Set;

import java.util.Comparator;
import java.util.TreeSet;

public class treeset3 {
    static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((o1,o2)->{
                int i = o1.length() - o2.length();
                i = i == 0?o1.compareTo(o2):i;
                return i;
            }
        );

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        for (String t : ts) {
            System.out.println(t);
        }
    }
}
