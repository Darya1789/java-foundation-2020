package ru.itsjava.classwork.collection.list.mylinkedlist;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс MyLinkedList должен: ")
public class MyLinkedListTest {

    public static final String DEFAULT_ELEM_1 = "Elem 1";
    public static final String DEFAULT_ELEM_2 = "Elem 2";
    public static final String DEFAULT_ELEM_3 = "Elem 3";
    public static final String DEFAULT_ELEM_4 = "Elem 4";
    public static final String DEFAULT_ELEM_5 = "Elem 5";

    @DisplayName(" корректно удалять 1й элемент по значению")
    @Test
    public void shouldHaveCorrectRemoveByElement() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM_1);
        list.add(DEFAULT_ELEM_2);
        list.add(DEFAULT_ELEM_3);
        list.add(DEFAULT_ELEM_4);
        list.add(DEFAULT_ELEM_5);
        int sizeBeforeRemove = list.size();

        assertAll("list",
                () -> assertTrue(list.remove(DEFAULT_ELEM_1)),
                () -> assertEquals(sizeBeforeRemove - 1, list.size()));
    }

    @DisplayName(" корректно удалять элемент по середине по значению")
    @Test
    public void shouldHaveCorrectRemoveByElementFirst() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM_1);
        list.add(DEFAULT_ELEM_2);
        list.add(DEFAULT_ELEM_3);
        list.add(DEFAULT_ELEM_4);
        list.add(DEFAULT_ELEM_5);
        int sizeBeforeRemove = list.size();
        assertAll("list",
                () -> assertTrue(list.remove(DEFAULT_ELEM_3)),
                () -> assertEquals(sizeBeforeRemove - 1, list.size()));
    }

    @DisplayName(" корректно удалять по последний элемент")
    @Test
    public void shouldHaveCorrectRemoveByElementMiddle() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM_1);
        list.add(DEFAULT_ELEM_2);
        list.add(DEFAULT_ELEM_3);
        list.add(DEFAULT_ELEM_4);
        list.add(DEFAULT_ELEM_5);
        int sizeBeforeRemove = list.size();
        assertAll("list",
                () -> assertTrue(list.remove(DEFAULT_ELEM_5)),
                () -> assertEquals(sizeBeforeRemove - 1, list.size()));
    }

    @DisplayName(" корректно добавлять элемент")
    @Test
    public void shouldHaveCorrectAddElementLast() {
        MyLinkedList list = new MyLinkedList();
        int sizeBeforeRemive = list.size();
        list.add(DEFAULT_ELEM_1);
        assertEquals(sizeBeforeRemive + 1, list.size());
    }

    @DisplayName(" должен иметь правильный размер")
    @Test
    public void shouldHaveCorrectSize() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM_1);
        assertEquals(1, list.size());
    }

    @DisplayName(" должен корректно определять пустоту листа")
    @Test
    public void shouldCorrectDefineAboutEmptyList() {
        MyLinkedList list = new MyLinkedList();
        assertTrue(list.isEmpty());
    }

    @DisplayName(" должен корректно проверять наличие элемента в списке")
    @Test
    public void shouldCorrectCheckObjectInList() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM_1);
        list.add(DEFAULT_ELEM_2);
        list.add(DEFAULT_ELEM_3);
        list.add(DEFAULT_ELEM_4);
        list.add(DEFAULT_ELEM_5);
        assertAll("list",
                () -> assertTrue(list.contains(DEFAULT_ELEM_1)),
                () -> assertTrue(list.contains(DEFAULT_ELEM_3)),
                () -> assertTrue(list.contains(DEFAULT_ELEM_5)));

    }

    @DisplayName(" должен корректно удалять весь список")
    @Test
    public void shouldCorrectClearList() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM_1);
        list.clear();
        assertEquals(0, list.size());
    }

    @DisplayName(" должен корректно получать элемент по индексу")
    @Test
    public void shouldCorrectGetMethod() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM_1);
        list.add(DEFAULT_ELEM_2);
        assertEquals(DEFAULT_ELEM_2, list.get(1));
    }

    @DisplayName(" должен корректно заменять значение по индексу")
    @Test
    public void shouldCorrectSetMethod() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM_1);
        list.set(0, DEFAULT_ELEM_2);
        assertEquals(DEFAULT_ELEM_2, list.get(0));
    }



    @DisplayName(" корректно удалять по индексу")
    @Test
    public void shouldHaveCorrectRemoveByIndex() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM_1);
        int sizeBeforeRemive = list.size();
        list.remove(0);
        assertEquals(sizeBeforeRemive - 1, list.size());
    }

    @DisplayName(" должен корректно определять индекс по значению элемента")
    @Test
    public void shouldHaveCorrectIndexOfElement() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM_1);
        list.add(DEFAULT_ELEM_2);
        assertEquals(1, list.indexOf(DEFAULT_ELEM_2));
    }


    @DisplayName(" должен корректно определять последний индекс по значению элемента")
    @Test
    public void shouldHaveCorrectLastIndexOfElement() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM_1);
        list.add(DEFAULT_ELEM_2);
        list.add(DEFAULT_ELEM_2);
        assertEquals(2, list.lastIndexOf(DEFAULT_ELEM_2));
    }

    @DisplayName(" должен корректно преобразовывать список в массив")
    @Test
    public void shouldCorrectToArray() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM_1);
        list.add(DEFAULT_ELEM_2);
        list.add(DEFAULT_ELEM_2);
        Object[] tempArray = {DEFAULT_ELEM_1, DEFAULT_ELEM_2, DEFAULT_ELEM_2};
        assertArrayEquals(tempArray, list.toArray());
    }

    @DisplayName(" корректно добавлять элемент по индексу в начало")
    @Test
    public void shouldCorrectAddElementByIndexBeginning() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM_1);
        list.add(DEFAULT_ELEM_2);
        list.add(DEFAULT_ELEM_3);
        list.add(DEFAULT_ELEM_4);
        list.add(DEFAULT_ELEM_5);
        int sizeBeforeAdd = list.size();
        list.add(0, DEFAULT_ELEM_5);
        assertAll("list",
                () -> assertEquals(DEFAULT_ELEM_5, list.get(0)),
                () -> assertEquals(sizeBeforeAdd + 1, list.size()));

    }

    @DisplayName(" корректно добавлять элемент по индексу в середину")
    @Test
    public void shouldCorrectAddElementByIndexMiddle() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM_1);
        list.add(DEFAULT_ELEM_2);
        list.add(DEFAULT_ELEM_3);
        list.add(DEFAULT_ELEM_4);
        list.add(DEFAULT_ELEM_5);
        int sizeBeforeAdd = list.size();
        list.add(3, DEFAULT_ELEM_5);
        assertAll("list",
                () -> assertEquals(DEFAULT_ELEM_5, list.get(3)),
                () -> assertEquals(sizeBeforeAdd + 1, list.size()));

    }@DisplayName(" корректно добавлять элемент по индексу в конец")
    @Test
    public void shouldCorrectAddElementByIndexEnd() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM_1);
        list.add(DEFAULT_ELEM_2);
        list.add(DEFAULT_ELEM_3);
        list.add(DEFAULT_ELEM_4);
        list.add(DEFAULT_ELEM_5);
        int sizeBeforeAdd = list.size();
        list.add(5, DEFAULT_ELEM_1);
        assertAll("list",
                () -> assertEquals(DEFAULT_ELEM_1, list.get(5)),
                () -> assertEquals(sizeBeforeAdd + 1, list.size()));

    }


}
