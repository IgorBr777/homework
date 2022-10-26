package com.example.homework4;

import java.util.Objects;

public class Child {

    private int age;
    private String name;
    private int height;

    public Child(int age, String name, int height, String str) {
        this.age = age;
        this.name = name;
        this.height = height;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return age == child.age && height == child.height && Objects.equals(name, child.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, height);
    }

    @Override
    public String toString() {
        return "Child{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';


    }

}


