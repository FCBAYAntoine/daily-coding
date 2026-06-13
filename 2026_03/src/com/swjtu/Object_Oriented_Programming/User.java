package com.swjtu.Object_Oriented_Programming;

public class User {
    private String name;
    private int age;
    private String sex;
    private String tel;

    public void User(){

    }

    public User(String name, int age, String sex, String tel) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
