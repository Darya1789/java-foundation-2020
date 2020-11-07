package ru.itsjava.oop;


public class BritishCat extends Cat{

    public BritishCat() {
        super("британка");
        System.out.println("Я доча -- Британская кошка");
    }

    // alt + insert
    @Override
    public void sayMeow() {
        System.out.println("Mrrrr");
        super.sayMeow();
    }

    public void sayMrrr(){
        System.out.println("Mrr");
    }
}
