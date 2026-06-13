package com.swjtu.map;

import java.util.Set;
import java.util.TreeMap;

public class Treedemo2 {
    static void main(String[] args) {
        String s1 = "aababcabcdabcde";
        TreeMap<Character,Integer> tm = new TreeMap<>();
        for(int i = 0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(tm.containsKey(c)){
                tm.put(c,tm.get(c)+1);
            }else{
                tm.put(c,1);
            }
        }
        Set<Character> sc = tm.keySet();
        for (Character c : sc) {
            System.out.println(c+","+tm.get(c));
        }
    }
}
