package ru.itsjava.classwork.collection.list.myarraylist;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс MyArrayList должен: ")
public class MyArrayListTest {

    public static final String DEFAULT_ELEM = "Elem 1";

    @DisplayName(" корректно удалять по элементу")
    @Test
    public void shouldHaveCorrectRemoveByElement(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        int sizeBeforeRemive = list.size();
        list.remove(DEFAULT_ELEM);
        Assertions.assertEquals(sizeBeforeRemive - 1, list.size());
    }

    @DisplayName(" корректно добавлять элемент")
    @Test
    public void shouldHaveCorrectAddElement(){
        MyArrayList list = new MyArrayList();
        int sizeBeforeRemive = list.size();
        list.add(DEFAULT_ELEM);
        Assertions.assertEquals(sizeBeforeRemive + 1, list.size());
    }


}
