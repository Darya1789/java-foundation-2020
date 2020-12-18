package ru.itsjava.classwork.collection.list.mylinkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.add("Elem 1");
//
//        myLinkedList.add("DEFAULT_ELEM_2");
//        myLinkedList.add("DEFAULT_ELEM_3");
//        myLinkedList.add("DEFAULT_ELEM_4");
//        myLinkedList.add("DEFAULT_ELEM_5");
//        myLinkedList.add("DEFAULT_ELEM_6");
//
////        System.out.println("myLinkedList.contains(\"DEFAULT_ELEM_2\") = " + myLinkedList.contains("Elem 1"));
////        System.out.println("myLinkedList.contains(\"DEFAULT_ELEM_3\") = " + myLinkedList.contains("DEFAULT_ELEM_3"));
////        System.out.println("myLinkedList.contains(\"DEFAULT_ELEM_5\") = " + myLinkedList.contains("DEFAULT_ELEM_5"));
////        System.out.println("myLinkedList.contains(\"DEFAULT_ELEM_6\") = " + myLinkedList.contains("DEFAULT_ELEM_6"));
//
//        System.out.println(myLinkedList);
//
//        System.out.println("myLinkedList.size() = " + myLinkedList.size());
//        System.out.println("myLinkedList.remove(1) = " + myLinkedList.remove(1));
//        System.out.println(myLinkedList);
//        System.out.println(myLinkedList.size());
//        System.out.println("myLinkedList.remove(4) = " + myLinkedList.remove(4));
//        System.out.println("myLinkedList.size() = " + myLinkedList.size());
//        System.out.println(myLinkedList);
//        System.out.println(myLinkedList.remove(0));
//        System.out.println("myLinkedList.size() = " + myLinkedList.size());
//        System.out.println(myLinkedList);





        MyLinkedList list = new MyLinkedList();
        list.add("DEFAULT_ELEM_1");
        list.add("DEFAULT_ELEM_2");
        list.add("DEFAULT_ELEM_3");
        list.add("DEFAULT_ELEM_4");
        list.add("DEFAULT_ELEM_5");
        System.out.println(list);
        System.out.println("list.size() = " + list.size());
        int sizeBeforeRemove = list.size();
        System.out.println("list.remove(\"DEFAULT_ELEM_5\") = " + list.remove("DEFAULT_ELEM_5"));
        System.out.println("list.size() = " + list.size());
        System.out.println(list);

    //    list.clear();
        System.out.println(list);

        list.add(0, "elem0");
        System.out.println(list);
        list.add(3, "elem0");
        System.out.println(list);
        list.add(6, "elem0");
        System.out.println(list);

    }
}
