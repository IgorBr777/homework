package com.example.homework4;

import java.util.Objects;

public class Adult {
    private int age;
    private String name;
    private int height;
    private String str = "The child became an adult";

    public Adult(int age, String name, int height, String str) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.str = str;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public String getStr() {
        return str;
    }


    @Override
    public String toString() {
        return "Adult{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", str='" + str + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adult adult = (Adult) o;
        return age == adult.age && height == adult.height && Objects.equals(name, adult.name) && Objects.equals(str, adult.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, height, str);
    }
}
