package com.swjtu.homework;

abstract class Employee {
    protected String name;
    protected int id;

    // 构造函数
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("工号: " + id + ", 姓名: " + name);
    }
}

class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    // 构造函数
    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer extends Employee {
    private double baseSalary;
    private double projectBonus;   // 项目提成

    public Developer(String name, int id, double baseSalary, double projectBonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.projectBonus = projectBonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + projectBonus;
    }
}

public class homework5 {
        public static void main(String[] args) {
            // 多态：父类引用指向子类对象
            Employee emp1 = new Manager("张三", 1001, 8000, 5000);
            Employee emp2 = new Developer("李四", 1002, 6000, 3000);

            // 调用多态方法
            System.out.println("=== 员工薪资信息 ===");
            emp1.displayInfo();
            System.out.println("薪资: " + emp1.calculateSalary() + " 元");

            System.out.println();
            emp2.displayInfo();
            System.out.println("薪资: " + emp2.calculateSalary() + " 元");
        }
    }

