package com.swjtu.Set;

import java.util.HashSet;
import java.util.Set;

public class demo2 {
    static void main(String[] args) {
        Set<Student> s1 = new HashSet<>();
        Student s3 = new Student("a",10);
        Student s2 = new Student("a",10);
        s1.add(s2);
        s1.add(s3);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
     }
}
