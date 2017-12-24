package com.leozzy.ten.innerclasses;

/**
 * Created by Leo
 */
abstract class Base{
    public Base(int i){
        System.out.println("Base constructor i = " + i);
    }
    public abstract void f();
}
public class AnonymousConstructor {
    public Base getBase(int i){
        return new Base(i) {
            {
                System.out.println("inside");
            }
            @Override
            public void f() {
                System.out.println("in anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = new AnonymousConstructor().getBase(47);
        base.f();
    }
}
