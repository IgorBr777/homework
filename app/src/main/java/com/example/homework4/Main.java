package com.example.homework4;

public class Main {
    public static void main(String[] args) {
       Phone firstPhone = new Phone(2736989,"Nokia", 170);
        Phone secondPhone = new Phone(5194899,"Honor", 160);
        Phone thirdPhone = new Phone(7153789,"Apple", 150);

        System.out.println("Номер телефона "+ firstPhone.getNumber() + ", модель телефона "+ firstPhone.getModel() + ", вес телефона " + firstPhone.getWeight());
        System.out.println("Номер телефона "+ secondPhone.getNumber() + ", модель телефона "+ secondPhone.getModel() + ", вес телефона " + secondPhone.getWeight());
        System.out.println("Номер телефона "+ thirdPhone.getNumber() + ", модель телефона "+ thirdPhone.getModel() + ", вес телефона " + thirdPhone.getWeight());


        firstPhone.receiveCall("Peter");
        secondPhone.receiveCall("Oleg");
        thirdPhone.receiveCall("Alex");

        firstPhone.receiveCall("Peter", 2736989);
        secondPhone.receiveCall("Oleg", 5194899);
        thirdPhone.receiveCall("Oleg", 7153789);

        firstPhone.sendMessage(secondPhone.getNumber());

        Crow crow = new Crow();
        crow.fly();

        Pigeon pigeon = new Pigeon();
        pigeon.fly();

    }

}
