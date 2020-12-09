package ru.itsjava.classwork.object;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Telephone должен")
public class TelephoneTest {

    public static final String DEFAULT_NUMBER = "9818571789";
    public static final String DEFAULT_NUMBER2 = "9888571789";
    public static final String DEFAULT_BRAND = "Huawei";
    public static final String DEFAULT_BRAND2 = "Honor";
    public static final int DEFAULT_PRICE = 20000;
    public static final int DEFAULT_PRICE2 = 10000;

    @DisplayName("иметь корректный конструктор от всех параметров")
    @Test
    public void shouldHaveCorrectAllArgsConstructor() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
//        Assertions.assertEquals("9818571789", telephone.getPhoneNumber());
//        Assertions.assertEquals("Huawei", telephone.getBrand());
//        Assertions.assertEquals(20000, telephone.getPrice());



        assertAll("telephone",
                () -> assertEquals("9818571789", telephone.getPhoneNumber()),
                () -> assertEquals(DEFAULT_BRAND, telephone.getBrand()),
                () -> assertEquals(20000, telephone.getPrice())
        );
    }

    @DisplayName("иметь корректный конструктор от final параметров")
    @Test
    public void shouldHaveCorrectRequiredArgsConstructor() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND);
        assertAll("telephone",
                () -> assertEquals(DEFAULT_NUMBER, telephone.getPhoneNumber()),
                () -> assertEquals(DEFAULT_BRAND, telephone.getBrand()));
    }

    @DisplayName("иметь корректный метод Get")
    @Test
    public void shouldHaveCorrectGetMethod() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
        assertAll("telephone",
                () -> assertEquals(DEFAULT_NUMBER, telephone.getPhoneNumber()),
                () -> assertEquals(DEFAULT_BRAND, telephone.getBrand()),
                () -> assertEquals(DEFAULT_PRICE, telephone.getPrice()));
    }
    @DisplayName("иметь корректный метод Set")
    @Test
    public void shouldHaveCorrectSetMethod() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND);
        telephone.setPrice(DEFAULT_PRICE);
        assertEquals(DEFAULT_PRICE, telephone.getPrice());
    }

    @DisplayName("иметь корректное сравнение")
    @Test
    public void shouldHaveCorrectEquals() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
        var telephone2 = new Telephone(DEFAULT_NUMBER2, DEFAULT_BRAND, DEFAULT_PRICE);
        var telephone3 = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);


        assertFalse(telephone.equals(telephone2));
        assertTrue(telephone.equals(telephone3));
    }


    @DisplayName("иметь корректный метод")
    @Test
    public void shouldHaveCorrectToString() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
        assertEquals("{brand: " + DEFAULT_BRAND + ", tel: " + DEFAULT_NUMBER + "}", telephone.toString());

    }



}
