package ru.itsjava.homework.threads;

public class Thread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("message3 " + i + " ");
        }
    }
}
