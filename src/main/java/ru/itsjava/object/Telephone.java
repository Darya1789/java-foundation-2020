package ru.itsjava.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data // getter + setter + equals + hashCode + toString
@AllArgsConstructor
@RequiredArgsConstructor
public class Telephone {
    public final String phoneNumber;
    private final String brand;
    private double price;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Telephone)) return false;
//
//        Telephone telephone = (Telephone) o;
//
//        if (Double.compare(telephone.price, price) != 0) return false;
//        if (!phoneNumber.equals(telephone.phoneNumber)) return false;
//        return brand != null ? brand.equals(telephone.brand) : telephone.brand == null;
//    }
//
//    @Override
//    public int hashCode() {
//        System.out.println("hashcode");
//        return phoneNumber.hashCode();
//    }

    @Override
    public String toString() {
        return "{brand: " + brand + ", tel: " + phoneNumber + "}";
    }


}
