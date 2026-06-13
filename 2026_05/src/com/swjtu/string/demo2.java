package com.swjtu.string;

import java.util.Scanner;

public class demo2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.next();
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

    }
}
