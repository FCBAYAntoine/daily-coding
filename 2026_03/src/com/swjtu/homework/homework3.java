package com.swjtu.homework;

public class homework3
{
    public static void main(String[] args) {
        Student stu = new Student("马宇铮", 19, "男", "2024112628");

        // 方式1
        System.out.println("方式1 学校：" + Student.university);
        System.out.println("方式1 学院：" + Student.college);

        // 方式2
        System.out.println("方式2 学校：" + stu.university);
        System.out.println("方式2 学院：" + stu.college);

        System.out.println("\n===== 学生信息 =====");
        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("性别：" + stu.getGender());
        System.out.println("学号：" + stu.getId());
    }
}

// 学生类
class Student {
    // 类变量（static）—— 学校不变
    public static String university = "西南交通大学";
    public static String college = "计算机与人工智能学院";

    // 成员变量
    private String name;
    private int age;
    private String gender;
    private String id;

    // 构造方法
    public Student(String name, int age, String gender, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    // 获取方法
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getId() { return id; }
}
