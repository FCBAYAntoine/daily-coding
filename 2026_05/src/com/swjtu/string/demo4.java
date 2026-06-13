package com.swjtu.string;

import java.util.StringJoiner;

public class demo4 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        StringJoiner sj = new StringJoiner(",","[","]");
        for(int i = 0;i<arr1.length;i++){
            sj.add(String.valueOf(arr1[i]));
        }
        String result = sj.toString();
        System.out.println(result);
    }
}
