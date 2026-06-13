package com.swjtu.Set;

import java.util.TreeSet;

public class Treeset2 {
    static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student("zhangsan",10);
        Student s2 = new Student("lisi",13);
        Student s3 = new Student("wangwu",8);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        for (Student t : ts) {
            System.out.println(t.getName());
            System.out.println(t.getAge());
        }
    }
}
