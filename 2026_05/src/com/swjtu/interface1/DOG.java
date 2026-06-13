package com.swjtu.interface1;

public class DOG extends animal implements Swim{
    public DOG() {
    }
    public DOG(String name, int age) {
        super(name, age);
    }
    public void eat() {
        System.out.println("DOG eat");
    }
    public void swim() {
        System.out.println("DOG swim");
    }
}
