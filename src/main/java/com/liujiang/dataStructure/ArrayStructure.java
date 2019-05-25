package com.liujiang.dataStructure;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 数组
 *
 * @author isaac
 * @version 1.0.0
 * @since 2018.11.05
 */
public class ArrayStructure implements Serializable{

    private Object[] objectArray;
    private int elems;
    private int length;

    private static final int DEFAULT_CAPACITY = 10;

    private static final int COPY_OF = 2;

    public ArrayStructure() {
        elems = 0;
        this.length = DEFAULT_CAPACITY;
        this.objectArray = new Object[length];
    }

    public ArrayStructure(int length) {
        elems = 0;
        this.length = length;
        this.objectArray = new Object[length];
    }

    /**
     * 获取数组的有效长度
     */
    public int length() {
        return elems;
    }

    /**
     * 给数据添加一个元素
     */
    public boolean add(Object value) {
        if (elems == length) {

            Object [] copyOf = new Object[length*2];
            System.arraycopy(objectArray, 0, copyOf, 0, length);
            objectArray = copyOf;
            this.length = length * 2;
            return false;
        } else {
            objectArray[elems] = value;
            elems++;
        }
        return true;
    }

    public void show()
    {
        System.out.println(objectArray.length);
        System.out.println(elems);
        System.out.println(length);
    }

    /**
     * 查找一个元素
     *
     * @param index
     */
    public Object get(int index) {
        if (index > elems - 1) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
        return objectArray[index];
    }

    /**
     * 删除一个元素
     *
     * @param index
     */
    public boolean remove(int index) {
        if (index > elems - 1) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
        if (index == elems - 1) {
            elems--;
            return true;
        } else {
            for (int i = index; i < elems-1; i++) {
                objectArray[i] = objectArray[i + 1];
            }
            elems--;
            return true;
        }
    }

    /**
     * 删除一个元素
     *
     * @param value
     */
    public boolean remove(Object value) {
        if (value == null) {
            for (int index = 0; index < elems; index++) {
                if (objectArray[index] == null) {
                    remove(index);

                }
            }
        } else {
            for (int index = 0; index < elems; index++) {
                if (objectArray[index].equals(value)) {
                    remove(index);
                    return true;
                }
            }
        }
        return false;
    }
    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + this.elems;
    }

    public static void main(String[] args) {

        ArrayStructure array = new ArrayStructure(5);
        array.add("a");
        array.add(1);
        array.add("c");
        array.add("d");
        array.add("e");
        array.add("f");
        array.show();
    }
}

