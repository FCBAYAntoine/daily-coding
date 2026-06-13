package com.swjtu.map;

import com.swjtu.Set.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class demo2 {
    static void main(String[] args) {
        Student2 s1 = new Student2("zhangsan",10);
        Student2 s2 = new Student2("lisi",13);
        Student2 s3 = new Student2("wangwu",8);
        HashMap<Student2,String> hm = new HashMap<>();
        hm.put(s1,"河南");
        hm.put(s2,"陕西");
        hm.put(s3,"山西");

        System.out.println(hm);
        Set<Student2> ks = hm.keySet();
        Iterator<Student2> it = ks.iterator();
        while(it.hasNext()){
            Student2 s = it.next();
            String add = hm.get(s);
            System.out.println(s+","+add);
        }

        System.out.println("------------------");

        Set<Map.Entry<Student2, String>> se = hm.entrySet();
        for (Map.Entry<Student2, String> me : se) {
            System.out.println(me.getKey()+","+me.getValue());
        }

        System.out.println("-------------------");

        hm.forEach((student2, s)-> System.out.println(student2+","+s));
    }
}
