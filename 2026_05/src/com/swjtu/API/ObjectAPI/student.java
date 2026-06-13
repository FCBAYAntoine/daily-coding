package com.swjtu.API.ObjectAPI;

import java.util.Objects;

public class student {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

}
