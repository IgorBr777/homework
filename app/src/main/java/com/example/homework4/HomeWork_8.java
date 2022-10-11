package com.example.homework4;

import java.util.Random;

public class HomeWork_8 {

    public static void main(String[] args) {
        Car firstCar = new Car("Mazda", 120, 20000);
        Car secondCar = new Car("BMW", 200, 30000);
        Car thirdCar = new Car("Lexus", 240, 50000);

        try {
            firstCar.startCar();
        } catch (CantStartCarException e) {
            System.out.println(e.getMessage());
        }

        try {
            secondCar.startCar();
        } catch (CantStartCarException e) {
            System.out.println(e.getMessage());
        }

        try {
            thirdCar.startCar();
        } catch (CantStartCarException e) {
            System.out.println(e.getMessage());
        }

    }

}


class Car {
    private String model;
    private int speed;
    private int price;

    public Car(String model, int speed, int price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void startCar() throws CantStartCarException {
        Random r = new Random();
        int x = r.nextInt(20) + 1;
        if (x % 2 == 0) {
            throw new CantStartCarException("Error your" + " " + getModel() + " " + " won't start");
        } else {

            System.out.println("Great, your" + " " + getModel() + " " + "start");
        }

    }

}

class CantStartCarException extends Exception {
    private String message;

    CantStartCarException(String message) {
        this.message = message;
        setMessage(message);

    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}