package com.swjtu.basic;
import java.util.Scanner;

public class study1 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        if(money>600){
            System.out.println("付款成功");
        }
        else{
            System.out.println("付款失败");
        }
    }
}
