package com.example.homework4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class HomeWork_11 {

    public static void main(String[] args) {
        Adult adult = new Adult(35, "Marina", 60, "The child became an adult");

        Converter<Adult, Child> converter = x -> new Child(x.getAge(), x.getName(), x.getHeight(), x.getStr());
        Child child = converter.convert(adult);
        System.out.println(child.getAge() + " " + child.getName() + " " + child.getHeight() + " -The child became an adult");

        List<Adult> adults = new ArrayList<Adult>();
        adults.add(new Adult(25, "Misha", 70, ""));
        adults.add(new Adult(33, "Olya", 65, ""));
        adults.add(new Adult(20, "Sasha", 90, ""));
        adults.add(new Adult(40, "Dima", 85, ""));

        adults.stream().map(Adult::getAge).forEach((n) -> {

            System.out.print(n + " ");

        });

        adults.stream().map(Adult::getName).forEach((n) -> {

            System.out.print(n + " ");

        });

        adults.stream().map(Adult::getHeight).forEach((n) -> {

            System.out.print(n + " ");

        });
        adults.stream().map(Adult::getStr).forEach((n) -> {

            System.out.print(n + " ");

        });
        System.out.println();
        adults.stream().skip(1).limit(2).forEach(s -> System.out.println(s));
        adults.stream().sorted
                (new Comparator<Adult>() {
                    @Override
                    public int compare(Adult adult, Adult t1) {
                        return Integer.valueOf(adult.getAge()).compareTo(Integer.valueOf(t1.getAge()));
                    }
                }).forEach(s -> System.out.printf(" " + s.getAge() + " " + s.getName() + " " + s.getHeight()));


    }

    @FunctionalInterface
    public interface Converter<T, N> {
        N convert(T t);

        static <T> boolean isNotNull(T t) {
            return t != null;
        }

        boolean equals(Object obj);
    }


}
