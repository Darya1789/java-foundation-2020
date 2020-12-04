package ru.itsjava.object;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс Telephone должен")
public class TelephoneTest {

    public static final String DEFAULT_NUMBER = "9818571789";
    public static final String DEFAULT_BRAND = "Huawei";
    public static final int DEFAULT_PRICE = 20000;

    @DisplayName("иметь корректный конструктор")
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
}
