package com.swjtu.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a1","a2","a3","a4");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
