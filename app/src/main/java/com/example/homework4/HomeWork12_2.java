package com.example.homework4;

public class HomeWork12_2 {
    // Task2
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread1());
        thread1.start();

        Thread thread2 = new Thread(new MyThread2());
        thread2.start();

        Thread thread3 = new Thread() {
            @Override
            public void run() {
                System.out.println(" I'm running in first Thread");
            }
        };
        thread3.start();

        Runnable thread4 = new Runnable() {
            @Override
            public void run() {
                System.out.println(" I'm running in first Runnable");
            }
        };
        Thread thread = new Thread(thread4);
        thread.start();

        // Task 3

        MyThread2 myThread2 = new MyThread2() {
            @Override
            public void run() {
                System.out.println(" Runnable has been passed to another thread for execution");
            }
        };

        Thread thread5 = new Thread(myThread2);
        thread5.start();

    }
}


class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println(" I'm running in second Thread");
    }
}


class MyThread2 implements Runnable {

    @Override
    public void run() {
        System.out.println(" I'm running in second Runnable");
    }
}


