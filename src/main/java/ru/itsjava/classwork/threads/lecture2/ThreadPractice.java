package ru.itsjava.classwork.threads.lecture2;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
//        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());

//        Thread myThread = new Thread(() -> {
//            try {
//                Thread.sleep(4000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Daemon");
//        });
//        myThread.setDaemon(true);
//        myThread.start();


//        System.out.println("Start");
//
//        Thread thread = new Thread(() ->
//            System.out.println("I'm thread"));
//        thread.start();
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("End");

//
//        Object obj = new Object();
////        obj.wait();
//        synchronized (obj){
//            obj.wait();
//        }


//        final Printer monitor = new Printer();
//
//        new ThreadPrinter("A", 5, monitor).start();
//        new ThreadPrinter("B",  5, monitor).start();
//        new ThreadPrinter("C",  5, monitor).start();
////        new Printer("D",  5, monitor).start();
//
////        monitor.printM();

        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        AtomicInteger atomicInteger = new AtomicInteger(5);
        int i = atomicInteger.incrementAndGet();


    }
}
