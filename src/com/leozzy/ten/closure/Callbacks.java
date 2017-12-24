package com.leozzy.ten.closure;

/**
 * Created by Leo
 */
interface Incrementable{
    void increment();
}

class Callee1 implements Incrementable{
    private int i = 0;
    @Override
    public void increment(){
        i++;
        System.out.println("i : " + i);
    }
}

class MyIncrementable{
    public void increment(){
        System.out.println("Other operation");
    }
    static void f(MyIncrementable mi){
        mi.increment();
    }
}

class Callee2 extends MyIncrementable{
    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println("i : " + i);
    }

    private class Closure implements Incrementable{
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference(){
        return new Closure();
    }
}

class Caller{
    private Incrementable callbackReference;
    Caller(Incrementable cbh){
        callbackReference = cbh;
    }
    void go(){
        callbackReference.increment();
    }
}

public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Caller caller1 = new Caller(c1);
        caller1.go();
        caller1.go();

        Callee2 c2 = new Callee2();
        MyIncrementable.f(c2);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller2.go();
    }
}
