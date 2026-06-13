package com.swjtu.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo1 {
    static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("Antoine","Griezmannn");
        m.put("Lionel","Messi");
        m.put("Cristiano","Ronaldo");
        System.out.println(m);
        System.out.println("--------------------------------");
        Set<String> keys = m.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key+","+m.get(key));
        }
        System.out.println("--------------------------------");
        Set<Map.Entry<String, String>> entries = m.entrySet();
        for (Map.Entry<String, String> e : entries) {
            System.out.println(e.getKey()+","+e.getValue());
        }
        System.out.println("--------------------------------");

        m.forEach((key, value)-> System.out.println(key+","+value));
    }
}
