package com.swjtu.basic;
import java.util.Random;

public class study3 {
    public static void main(String[] args)
    {
        int[] arr1 = new int[]{11,12,13,14};
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
        // 动态初始化
        //int [] arr = new int[6];
        //数组首尾交换
//        int[] arr2 = new int[]{11,12,13,14,15,16,17};
//        int i = 0;
//        int j = arr2.length - 1;
//        while(i<j)
//        {
//            int temp = arr2[i];
//            arr2[i]=arr2[j];
//            arr2[j]=temp;
//            i++;
//            j--;
//        }
//        for (int i1 = 0; i1 < arr2.length; i1++) {
//            System.out.print(arr2[i1]);
//        }

        //验证码
        char[] chs = new char[52];
        for(int i = 0 ;i < chs.length;i++)
        {
            if(i<=25)
            {
                chs[i] = (char)('a'+i);
            }else{
                chs[i] = (char)('A'+i-26);
            }
        }
//        for (int i = 0; i < chs.length; i++) {
//            System.out.print(chs[i]);
//        }
        Random rand = new Random();
        String result = "";
        for(int i = 0;i < 4;i++)
        {
            result += chs[rand.nextInt(chs.length)];
        }
        result += rand.nextInt(10);
        System.out.print(result);

    }
}
