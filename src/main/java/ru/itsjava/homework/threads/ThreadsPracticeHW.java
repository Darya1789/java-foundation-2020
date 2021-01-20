package ru.itsjava.homework.threads;

public class ThreadsPracticeHW {
    public static void main(String[] args) throws InterruptedException {
        // Задание 1. создать два потока разными способами и запустить их
        System.out.println("Задание 1. создать два потока разными способами и запустить их");
        Thread thread1 = new Thread1();
        Thread runnableThread2 = new Thread(new Thread2());
        thread1.start();
        runnableThread2.start();
        Thread.sleep(100000);

        // Задание 2. Создать 3 поток, запустить все 3 потока, дождаться завершения 2 потока. 3 поток сделать демоном
        System.out.println("Задание 2.");
        Thread thread3 = new Thread1();
        Thread runnableThread4= new Thread(new Thread2());
        Thread thread5 = new Thread3();
        thread5.setDaemon(true);

        runnableThread4.start();
        runnableThread4.join();
        thread3.start();
        thread5.start();


    }
}
