package com.swjtu.API.Date;

import java.util.Calendar;
import java.util.Date;

public class demo2 {
    static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        Date d = new Date(0);
        c.setTime(d);
        System.out.println(c);

        c.set(Calendar.YEAR,2000);
        c.set(Calendar.MONTH,9);
        c.set(Calendar.DAY_OF_MONTH,10);
        c.add(Calendar.MONTH,1);
        System.out.println(c.get(1)+","+c.get(2)+","+c.get(5)+","+c.get(Calendar.DAY_OF_WEEK));
    }
}
