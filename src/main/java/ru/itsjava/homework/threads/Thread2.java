package ru.itsjava.homework.threads;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("message2 " + i + " ");

        }
    }
}
