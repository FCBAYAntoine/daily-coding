package com.swjtu.homework;

interface StudentInfo {
    String NAME = "马宇铮";
    long STUDENT_ID = 2024112628L;

    // 抽象函数：展示信息
    void showInfo();
}

// 实现类1：圆形
class Circle implements StudentInfo {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void showInfo() {
        System.out.println("【圆形】");
        System.out.println("半径：" + radius);
        System.out.println("面积：" + String.format("%.2f", getArea()));
        System.out.println("接口常量 -> 姓名：" + NAME + "，学号：" + STUDENT_ID);
    }
}

// 实现类2：矩形
class Rectangle implements StudentInfo {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public void showInfo() {
        System.out.println("【矩形】");
        System.out.println("宽：" + width + "，高：" + height);
        System.out.println("面积：" + String.format("%.2f", getArea()));
        System.out.println("接口常量 -> 姓名：" + NAME + "，学号：" + STUDENT_ID);
    }
}

public class homework6 {
    public static void main(String[] args) {
        // 打印姓名和学号
        System.out.println("姓名：" + StudentInfo.NAME);
        System.out.println("学号：" + StudentInfo.STUDENT_ID);
        System.out.println("-----------------------------");

        // 创建两个类的对象
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 7.0);

        // 调用抽象函数的实现（多态调用）
        circle.showInfo();
        System.out.println();
        rectangle.showInfo();
    }
}