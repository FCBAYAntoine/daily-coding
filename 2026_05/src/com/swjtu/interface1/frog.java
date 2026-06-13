package com.swjtu.interface1;

public class frog extends animal implements Swim{

    public frog() {
        super();
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("青蛙会游泳");
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }
}
