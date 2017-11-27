package com.leozzy.five;

/**
 * Created by Leo
 */
public class ThisTest01 {
    private int i = 0;
    //返回当前对象的引用，并且可以链式调用
    private ThisTest01 increment(){
        i++;
        return this;
    }

    private void print(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        ThisTest01 t1 = new ThisTest01();
        t1.increment().increment().print();
    }
}
