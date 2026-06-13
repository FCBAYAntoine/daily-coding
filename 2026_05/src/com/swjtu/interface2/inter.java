package com.swjtu.interface2;

public interface inter {
    public abstract void method();
    public default void show(){
        System.out.println("show");
    }

    public static void show2(){
        System.out.println("静态show");
    }

}
