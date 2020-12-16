package ru.itsjava.classwork.collection.list.mylinkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Elem 1");

        myLinkedList.add("DEFAULT_ELEM_2");
        myLinkedList.add("DEFAULT_ELEM_3");
        myLinkedList.add("DEFAULT_ELEM_4");
        myLinkedList.add("DEFAULT_ELEM_5");
        myLinkedList.add("DEFAULT_ELEM_6");

        System.out.println("myLinkedList.contains(\"DEFAULT_ELEM_2\") = " + myLinkedList.contains("Elem 1"));
        System.out.println("myLinkedList.contains(\"DEFAULT_ELEM_3\") = " + myLinkedList.contains("DEFAULT_ELEM_3"));
        System.out.println("myLinkedList.contains(\"DEFAULT_ELEM_5\") = " + myLinkedList.contains("DEFAULT_ELEM_5"));
        System.out.println("myLinkedList.contains(\"DEFAULT_ELEM_6\") = " + myLinkedList.contains("DEFAULT_ELEM_6"));

    }
}
