package com.leozzy.ten.innerclasses;

/**
 * Created by Leo
 */
public class OuterClass {
    private int i = 3;
    private void say(){
        System.out.println("hello");

    }
    public class InnerClass{
        private void modify(){
            i = 4;
            say();
        }
    }
    void getInnerClass(){
        InnerClass in = new InnerClass();
        in.modify();
        System.out.println(i);
    }

    public static void main(String[] args) {
        new OuterClass().getInnerClass();
    }
}
