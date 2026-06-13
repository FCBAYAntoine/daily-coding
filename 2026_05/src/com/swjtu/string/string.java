package com.swjtu.string;

public class string {
    static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        String s3 = "Abc";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
