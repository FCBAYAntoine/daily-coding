package com.swjtu.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class demo1 {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.add(1,"www");
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);

        System.out.println("-----------------------------------");
        System.out.println("进程已结束，退出代码为 0");

        Iterator<String> ite = list.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
        System.out.println("-----------------------------------");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------------------------");
        list.forEach(s->System.out.println(s));
    }
}
