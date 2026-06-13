package com.swjtu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class demo1 {
    static void main(String[] args) {
        Collection<String> coll= new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        Iterator<String> ite = coll.iterator();
        while(ite.hasNext())
            System.out.println(ite.next());
//        ite.next();
        for(String s:coll){
            System.out.println(s);
        }
        System.out.println("-----------------------------");
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        coll.forEach(s-> System.out.println(s));
    }
}
