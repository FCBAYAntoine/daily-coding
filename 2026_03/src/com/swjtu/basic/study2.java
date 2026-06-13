package com.swjtu.basic;
import java.util.Random;

public class study2 {
    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        switch(num){
//            case 1 ->{
//                System.out.println(1);
//            }
//            case 2 ->{
//                System.out.println(2);
//            }
//            case 3 ->{
//                System.out.println(3);
//            }
//            default ->{
//                System.out.println("没有这个选项");
//            }
//        }
        //回文数
//        int count = num;
//        int outcome = 0;
//        while(count!=0)
//        {
//            int ge = count % 10;
//            count /= 10;
//            outcome = outcome *10 + ge;
//        }
//        if(outcome == num)
//        {
//            System.out.println("YES");
//        }
//    }
        //跳转循环
//        for(int i = 0;i < 5 ; i++ )
//        {
//            if(i == 3)
//            {
//                continue;
//            }
//            System.out.println("i =" + i);
//        }
        Random rand = new Random();
        int num = rand.nextInt(100);
        System.out.println(num);
    }
}
