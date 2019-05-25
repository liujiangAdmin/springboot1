package com.liujiang.dataStructure;

import net.sf.json.JSONObject;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 栈
 *
 * @author isaac
 * @version 1.0.0
 * @since 2018.11.08
 */
public class StackController {

    //存储元素的数组,声明为Object类型能存储任意类型的数据
    private Object[] elementData;
    //指向栈顶的指针
    private int top;
    //栈的总容量
    private int size;

    //默认构造一个容量为10的栈
    public StackController() {
        this.elementData = new Object[10];
        this.top = -1;
        this.size = 10;
    }

    //构造容量为initialCapacity的栈
    public StackController(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("栈初始容量不能小于0: " + initialCapacity);
        }
        this.elementData = new Object[initialCapacity];
        this.top = -1;
        this.size = initialCapacity;
    }

    //压入元素
    public Object push(Object item) {
        toGrow(top + 1);
        elementData[++top] = item;
        return item;
    }

    //弹出栈顶元素
    public Object pop() {
        Object obj = peek();
        remove(top);
        return obj;
    }

    //获取栈顶元素
    public Object peek() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return elementData[top];
    }

    //删除栈顶元素
    public void remove(int top) {
        //栈顶元素置为null
        elementData[top] = null;
        this.top--;
    }

    //判断栈是否为空
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean toGrow(int minCapacity) {
        if (minCapacity >= size) {
            int newCapacity = 0;
            if ((minCapacity << 1) >= Integer.MAX_VALUE) {
                newCapacity = Integer.MAX_VALUE;
            } else {
                newCapacity = (minCapacity << 1);
            }
            this.size = newCapacity;
            elementData = Arrays.copyOf(elementData, size);
        }
        return false;
    }

    public static void main(String[] args) {
        //倒序输出
        StackController stackController = new StackController();
        String str = "abc def ghi";
        char [] strArray = str.toCharArray();
        for (char c : strArray)
        {
            stackController.push(c);
        }
        while (!stackController.isEmpty())
        {
           System.out.print(stackController.pop());
        }

        //利用栈判断分隔符是否匹配
        StackController stackController1 = new StackController();
        String json = "[{\"name\":\"zhangsan\",\"age\":23,\"email\":\"chentging@aliyun.com\"},{\"name\":\"zhangsan\",\"age\":23,\"email\":\"chentging@aliyun.com\"}]";
        JSONObject jsonObject = new JSONObject();
        jsonObject.fromObject("");

    }
}
