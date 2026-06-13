package com.swjtu.API.Integer;

import java.util.Scanner;

public class demo1 {
    static void main(String[] args) {
        String s1 = "123";
        int i = Integer.parseInt(s1);
        System.out.println(i+1);
        Scanner sc = new Scanner(System.in);
        String s2 = sc.nextLine();
        System.out.println(s2);
    }
}
