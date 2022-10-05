package com.example.homework4;

abstract class Transport {


    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.drive();
        bicycle.makeBeep();

        Car car = new Car();
        car.turnMotor();
        car.drive();
        car.makeBeep();

        Tractor tractor = new Tractor();
        tractor.turnMotor();
        tractor.drive();
        tractor.makeBeep();

    }

    abstract void drive();

    abstract void makeBeep();

    void turnMotor() {
        System.out.println("Заводится мотор");

    }
}
    class Bicycle extends Transport{


       @Override
       void drive() {
           System.out.println("Велосипед  едет");

       }

       @Override
       void makeBeep() {
           System.out.println("Велосипед  издаёт гудок");
       }
   }

    class Car extends  Transport {


       @Override
       void drive() {

           System.out.println("Машина едет");

       }

       @Override
       void makeBeep() {
           System.out.println("Машина издаёт гудок");

       }
   }

     class Tractor extends  Transport {


        @Override
        void drive() {
            System.out.println("Трактор едет");
        }

        @Override
        void makeBeep() {
            System.out.println("Трактор издаёт гудок");

        }
    }
    


