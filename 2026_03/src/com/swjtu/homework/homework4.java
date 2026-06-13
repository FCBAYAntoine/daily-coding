package com.swjtu.homework;

class A {
    // 成员变量
    private int valueA;

    // 构造方法
    public A(int valueA) {
        this.valueA = valueA;
        System.out.println("调用A的构造方法，初始化valueA = " + valueA);
    }

    // 获取valueA的值（用于外部访问）
    public int getValueA() {
        return valueA;
    }
}

class B extends A {
    private int valueB;

    // 构造方法：接收两个参数，分别用于初始化父类成员和子类成员
    public B(int valueA, int valueB) {
        super(valueA);          // 调用父类A的构造方法，初始化valueA
        this.valueB = valueB;
        System.out.println("调用B的构造方法，初始化valueB = " + valueB);
    }

    // 获取valueB的值
    public int getValueB() {
        return valueB;
    }
}
public class homework4 {


        public static void main(String[] args) {
            A objA = new A(100);
            System.out.println("类A的成员变量 valueA = " + objA.getValueA());
            System.out.println("---------------------------");

            B objB = new B(200, 300);
            System.out.println("类B继承自类A的成员变量 valueA = " + objB.getValueA());
            System.out.println("类B自身的成员变量 valueB = " + objB.getValueB());
        }
    }
