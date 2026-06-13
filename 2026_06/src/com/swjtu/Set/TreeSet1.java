package com.swjtu.Set;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(30);
        ts.add(400);
        ts.add(5);
        System.out.println(ts.add(2));
        System.out.println(ts);
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------------------------------");
        for (Integer t : ts) {
            System.out.println(t);
        }
        System.out.println("----------------------------------");
        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("----------------------------------");

        ts.forEach(integer->System.out.println(integer));
    }
}
