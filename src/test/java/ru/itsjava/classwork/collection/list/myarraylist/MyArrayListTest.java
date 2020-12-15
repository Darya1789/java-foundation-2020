package ru.itsjava.classwork.collection.list.myarraylist;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс MyArrayList должен: ")
public class MyArrayListTest {

    public static final String DEFAULT_ELEM_1 = "Elem 1";
    public static final String DEFAULT_ELEM_2 = "Elem 2";

    @DisplayName(" корректно удалять по элементу")
    @Test
    public void shouldHaveCorrectRemoveByElement(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM_1);
        int sizeBeforeRemive = list.size();
        list.remove(DEFAULT_ELEM_1);
        assertEquals(sizeBeforeRemive - 1, list.size());
    }

    @DisplayName(" корректно добавлять элемент")
    @Test
    public void shouldHaveCorrectAddElement(){
        MyArrayList list = new MyArrayList();
        int sizeBeforeRemive = list.size();
        list.add(DEFAULT_ELEM_1);
        assertEquals(sizeBeforeRemive + 1, list.size());
    }

    @DisplayName(" должен иметь правильный размер")
    @Test
    public void shouldHaveCorrectSize(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(DEFAULT_ELEM_1);
        assertEquals(1, myArrayList.size());
    }

    @DisplayName(" должен корректно определять пустоту листа")
    @Test
    public void shouldCorrectDefineAboutEmptyList(){
        MyArrayList myArrayList = new MyArrayList();
        assertEquals(true, myArrayList.isEmpty());
    }

    @DisplayName(" должен корректно проверять наличие элемента в списке")
    @Test
    public void shouldCorrectCheckObjectInList(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(DEFAULT_ELEM_1);
        assertEquals(true, myArrayList.contains(DEFAULT_ELEM_1));
    }

    @DisplayName(" должен корректно удалять весь список")
    @Test
    public void shouldCorrectClearList(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(DEFAULT_ELEM_1);
        myArrayList.clear();
        assertEquals(0, myArrayList.size());
    }

    @DisplayName(" должен корректно получать элемент по индексу")
    @Test
    public void shouldCorrectGetMethod(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(DEFAULT_ELEM_1);
        myArrayList.add(DEFAULT_ELEM_2);
        assertEquals(DEFAULT_ELEM_2, myArrayList.get(1));
    }

    @DisplayName(" должен корректно присваивать значение по индексу")
    @Test
    public void shouldCorrectSetMethod(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(DEFAULT_ELEM_1);
        myArrayList.set(0,DEFAULT_ELEM_2);
        assertEquals(DEFAULT_ELEM_2, myArrayList.get(0));
    }

    @DisplayName(" корректно удалять по индексу")
    @Test
    public void shouldHaveCorrectRemoveByIndex(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM_1);
        int sizeBeforeRemive = list.size();
        list.remove(0);
        assertEquals(sizeBeforeRemive - 1, list.size());
    }

    @DisplayName(" должен корректно определять индекс по значению элемента")
    @Test
    public void shouldHaveCorrectIndexOfElement(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(DEFAULT_ELEM_1);
        myArrayList.add(DEFAULT_ELEM_2);
        assertEquals(1, myArrayList.indexOf(DEFAULT_ELEM_2));
    }


    @DisplayName(" должен корректно определять последний индекс по значению элемента")
    @Test
    public void shouldHaveCorrectLastIndexOfElement(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(DEFAULT_ELEM_1);
        myArrayList.add(DEFAULT_ELEM_2);
        myArrayList.add(DEFAULT_ELEM_2);
        assertEquals(2, myArrayList.lastIndexOf(DEFAULT_ELEM_2));
    }





}
