package com.swjtu.API.runtimeAPI;

import java.io.IOException;

public class demo1 {
    static void main(String[] args) throws IOException {
        Runtime r1 = Runtime.getRuntime();
        System.out.println(r1.availableProcessors());
        System.out.println(r1.maxMemory()/1024/1024);
        System.out.println(r1.totalMemory()/1024/1024);
        System.out.println(r1.freeMemory()/1024/1024);
        r1.exec("shutdown -a");
    }
}
