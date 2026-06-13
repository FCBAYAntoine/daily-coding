package com.swjtu.API.systemAPI;

public class demo1 {
    static void main(String[] args) {
        int []arr1 = {1,2,3,4};
        int []arr2 = new int[6];
        System.arraycopy(arr1,1,arr2,2,2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
