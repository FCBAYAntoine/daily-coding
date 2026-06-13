package com.swjtu.string;

public class demo3 {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("world");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
    }
}
