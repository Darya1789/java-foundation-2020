package ru.itsjava.classwork.collection.list.myarraylist;

public class MyArrayList {
    private final static int DEFAULT_CAPaCITY = 10;
    private Object[] array;
    private int realSize;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPaCITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        return realSize == 0;
    }

    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    public Object[] toArray() {
        Object[] realArray = new Object[realSize];
        for (int i = 0; i < realSize; i++) {
            realArray[i] = array[i];
        }
        return realArray;
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[3 * realSize / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, realSize);
            array = resArray;
        }
        array[realSize++] = o;
        return true;
    }

    public void clear() {
        for (int i = 0; i < realSize; i++) {
            array[i] = null;
        }
        realSize = 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > realSize) {
            throw new IndexOutOfBoundsException("Index: " + index + " out of size " + realSize);
        }
    }

    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    public boolean set(int index, Object element) {
        checkIndex(index);
        array[index] = element;
        return true;
    }

    public boolean remove(int index) {
        checkIndex(index);
        Object[] resultArray = new Object[array.length];
        for (int i = 0; i < index; i++) {
            resultArray[i] = array[i];
        }
        for (int i = index; i < realSize; i++) {
            resultArray[i] = array[i + 1];
        }
        array = resultArray;
        realSize--;
        return true;
    }

    public boolean remove(Object o) {
        Object[] resultArray = new Object[array.length];
        int removeIndex = realSize;
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                removeIndex = i;
                break;
            }
            resultArray[i] = array[i];
        }
        if (removeIndex == realSize) return false;
        for (int i = removeIndex; i < realSize; i++) {
            resultArray[i] = array[i + 1];
        }
        array = resultArray;
        realSize--;
        return true;
    }

    public int indexOf(Object o) {
        int index = -1;
        for (int i = 0; i < realSize; i++) {
            if (array[i] == o) {
                return i;
            }
        }
        return index;
    }

    public int lastIndexOf(Object o) {
        int index = -1;
        for (int i = realSize; i >= 0 ; i--) {
            if (array[i] == o) {
                return i;
            }
        }
        return index;

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            result.append(array[i]).append(" ");
        }
        result.append('}');
        return result.toString();

    }
}
