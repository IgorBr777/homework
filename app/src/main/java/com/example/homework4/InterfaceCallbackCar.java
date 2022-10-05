package com.example.homework4;

public class InterfaceCallbackCar {



        public static void main(String[] args) {

        Car car = new Car(new ClickPedal());

        car.drive();
    }

        static class ClickPedal implements ITorsion {


            @Override
            public void twistWheels() {


                System.out.println("Колеса крутятся");
            }
        }


        interface ITorsion {


            void twistWheels();

        }

        static class Car {

            ITorsion iTorsion;

            public Car(ITorsion action) {
                this.iTorsion = action;
            }

            void drive() {
                iTorsion.twistWheels();

            }

        }

    }
























