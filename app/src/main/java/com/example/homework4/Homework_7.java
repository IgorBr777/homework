package com.example.homework4;

public class Homework_7 {

    public static void print(Seasons seasons) {

        switch (seasons) {

            case SPRING:
                System.out.println("I like Spring");
                break;
            case SUMMER:
                System.out.println("I like Summer");
                break;
            case AUTUMN:
                System.out.println("I like Autumn");
                break;
            case WINTER:
                System.out.println("I like Winter");
                break;
        }

    }

    public static void main(String[] args) {

        Seasons seasons = Seasons.SUMMER;
        System.out.println(seasons);
        print(Seasons.SUMMER);
        printAllSeasons();
    }

    public static void printAllSeasons() {
        for (Seasons s : Seasons.values()) {
            System.out.println(s + "  " + s.getAverageTemp() + " " + s.getDescription());
        }
    }

}

enum Seasons {
    SPRING(7.8),
    SUMMER(18.7) {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    },
    AUTUMN(7.5),
    WINTER(-2.1);
    private double averageTemp;

    public double getAverageTemp() {
        return averageTemp;
    }

    Seasons(double averageTemp) {
        this.averageTemp = averageTemp;
    }

    public String getDescription() {
        return "Cold season";
    }
}
