package ru.itsjava.homework.exception;

public class ExceptionHomework {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.err.println("Exception 1");
            e.printStackTrace();
            try {
                throw new Exception();
            } catch (Exception exception) {
                System.err.println("Exception 2");
                exception.printStackTrace();
            } finally {
                System.out.println("finally 2");
            }
        } finally {

            System.out.println("finally 1");
        }
    }
}
