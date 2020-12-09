package ru.itsjava.classwork.object;

public class TelephoneShop {
    public static void main(String[] args) {
        Telephone ilyaPhone = new Telephone("89881416838", "Xiaomi", 25);
        Telephone dashaPhone = new Telephone("89818571789", "Huawei", 16);
        Telephone dashaPhone2 = new Telephone("89818571789", "Huawei", 16);

        System.out.println("ilyaPhone.equals(dashaPhone) = " + ilyaPhone.equals(dashaPhone));

        System.out.println("dashaPhone.equals(dashaPhone2) = " + dashaPhone.equals(dashaPhone2));
        System.out.println("new Object().hashCode() = " + new Object().hashCode());

        System.out.println("dashaPhone.toString() = " + dashaPhone.toString());

    }


}
