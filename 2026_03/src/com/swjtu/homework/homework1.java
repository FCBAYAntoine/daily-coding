package com.swjtu.homework;
import java.util.Scanner;

public class homework1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        System.out.println("请输入学号");
        String id = sc.nextLine();
        String reversedName = new StringBuilder(name).reverse().toString();
        String reversedId = new StringBuilder(id).reverse().toString();
        System.out.println("姓名倒序：" + reversedName);
        System.out.println("学号倒序：" + reversedId);
    }
}
