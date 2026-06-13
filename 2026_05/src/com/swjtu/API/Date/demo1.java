package com.swjtu.API.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo1 {
    static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        Date d2 = new Date(0);
        System.out.println(d2.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(d2));

        String s1 = "2026年5月30日 16:48:30";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf2.format(d2));

        Date date = sdf2.parse(s1);
        System.out.println(date.getTime());
    }
}
