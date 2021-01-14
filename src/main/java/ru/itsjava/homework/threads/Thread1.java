package ru.itsjava.homework.threads;

public class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("message1 " + i + " ");
        }
    }
}
