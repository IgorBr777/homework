package com.example.homework4;

import static java.lang.Thread.sleep;

public class HomeWork13 {

    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();

    }
}
class Producer implements  Runnable {

    Store store;
    Producer(Store store) {
        this.store = store;

    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            try {
                sleep(300);
            } catch (Exception e) {}
                store.put();
            }
        }
    }

class  Consumer implements  Runnable{

    Store store;
    Consumer(Store store){
        this.store=store;

    }

    @Override
    public void run() {
        for (int i =1; i<2; i++){
            store.get();

        }
    }

}

class Store{
    private  int product = 0;
    synchronized  void  get(){
        while (product<1){
            try {
                wait();
            }catch (InterruptedException e){

                System.out.print(" get interrupted");

            }
        }
        product--;
        System.out.println("consumer bought 1 product");
        System.out.println("products available:"+ product);
        notify();

    }

    synchronized  void  put() {
        while (product >= 1) {
            try {
                wait();
            } catch (InterruptedException e) {

                System.out.print(" get interrupted");

            }
        }
        product++;
        System.out.println("producer made 1 product");
        System.out.println("products available:" + product);
        notify();

    }
}