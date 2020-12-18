package ru.itsjava.classwork.collection.list.mylinkedlist;


public class MyLinkedList {
    private Node head;
    private int realSize = 0;

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        return realSize == 0;
    }

    public boolean contains(Object o) {
        Node currentNode = head;
        while (currentNode.getValue() != null) {
            if (currentNode.getValue().equals(o)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }

        return false;
    }

    public boolean add(Object o) {
        Node node = new Node(o, null);
        if (head == null) {
            head = node;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(node);
        }
        realSize++;
        return true;
    }


    public boolean remove(Object o) {
        if (head.getValue().equals(o)) {
            Node prevNode = head;
            head = head.getNext();
            prevNode.setNext(null);
            realSize--;
            return true;
        }
        Node prevNode = head;
        Node curNode = head.getNext();
        while (!curNode.getValue().equals(o)) {
            prevNode = prevNode.getNext();
            curNode = curNode.getNext();
        }
        prevNode.setNext(curNode.getNext());
        curNode.setNext(null);
        realSize--;
        return true;
    }

    public void clear() {
        head = null;
        realSize = 0;

    }

    public Object get(int index) {
        checkIndex(index);
        if (index == 0) {
            return head.getValue();
        }

        Node curNode = head.getNext();

        int curIndex = 1;
        while (curIndex != index) {
            curNode = curNode.getNext();
            curIndex++;
        }

        return curNode.getValue();
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        if (index == 0) {
            head.setValue(element);
            return head.getValue();
        }

        Node curNode = head.getNext();

        int curIndex = 1;
        while (curIndex != index) {
            curNode = curNode.getNext();
            curIndex++;
        }

        curNode.setValue(element);
        return curNode.getValue();
    }

    public void add(int index, Object element) {
        checkIndex(index);
        if (index == 0) {
            Node prevHead = new Node(element, head);
            head = prevHead;
            realSize++;
            return;
        }

        Node prevNode = head;
        Node curNode = head.getNext();

        int curIndex = 1;
        while (curIndex != index) {
            prevNode = prevNode.getNext();
            curNode = curNode.getNext();
            curIndex++;
        }

        Node node = new Node(element, curNode);
        prevNode.setNext(node);
        realSize++;


    }

    private void checkIndex(int index) {
        if (index < 0 || index > realSize) {
            throw new IndexOutOfBoundsException("Index: " + index + " out of size " + realSize);
        }
    }

    public Object remove(int index) {
        checkIndex(index);
        if (index == 0) {
            Node prevHead = head;
            head = head.getNext();
            prevHead.setNext(null);
            realSize--;
            return prevHead.getValue();
        }

        Node prevNode = head;
        Node curNode = head.getNext();

        int curIndex = 1;
        while (curIndex != index) {
            prevNode = prevNode.getNext();
            curNode = curNode.getNext();
            curIndex++;
        }

        prevNode.setNext(curNode.getNext());
        curNode.setNext(null);
        realSize--;
        return curNode.getValue();
    }

    public int indexOf(Object o) {
        int index = -1;
        Node curNode = head;
        for (int i = 0; i < realSize; i++) {
            if (curNode.getValue().equals(o)) {
                return i;
            }
            curNode = curNode.getNext();
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        int index = -1;
        Node curNode = head;
        for (int i = 0; i < realSize; i++) {
            if (curNode.getValue().equals(o)) {
                index = i;
            }
            curNode = curNode.getNext();
        }
        return index;
    }

    public Object[] toArray() {
        Object[] realArray = new Object[realSize];
        Node curNode = head;
        for (int i = 0; i < realSize; i++) {
            realArray[i] = curNode.getValue();
            curNode = curNode.getNext();
        }
        return realArray;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Linked List { ");
        Node curNode = head;
        while (curNode != null) {
            stringBuilder.append(curNode.getValue()).append(" ");
            curNode = curNode.getNext();

        }
        return stringBuilder.append("}").toString();
    }
}
