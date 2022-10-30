package com.example.homework4;

import static java.lang.Thread.sleep;

public class HomeWork12_1 {
// Task 1

    public static void main(String[] args) {
ThreadClass threadClass = new ThreadClass();
Thread thread = new Thread(threadClass);
thread.start();
long start = System.currentTimeMillis();
System.out.println("The first thread is started: " +Thread.currentThread().getName()+ " "+ start );

    }
}


class ThreadClass implements Runnable{
    @Override
    public void run()
    {
      try {
          sleep(5000);
          long start = System.currentTimeMillis();
Thread thread =Thread.currentThread();
          System.out.println("The second thread is started:"+thread.getName()+ " " +start);
      }
catch (Exception e) {
    System.out.println(" exc thrown");

}

    }
}



