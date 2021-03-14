package com.test;

public class MultiThreadTest {

    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("this is thread name "+ Thread.currentThread().getName()));

        t.start();

        // simulate some activity by this thread
        try {
            t.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("main method is done");
    }
}
