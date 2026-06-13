package com.swjtu.ArrayList;

import java.util.ArrayList;


public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("hello");
        list.add("world");
        list.add("aaa");
        System.out.println(list);

        boolean res = list.remove("ddd");

        String str = list.remove(2);
        System.out.println(str);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
