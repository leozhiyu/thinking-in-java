package com.leozzy.ten.innerclasses;

/**
 * Created by Leo
 */
interface C{}
interface D{}
class X implements C,D{}
class Y implements C{
    D makeD(){
        return new D(){};
    }
}

public class MultiInterfaces {
    static void takesC(C c){}
    static void takesD(D d){}

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesC(x);
        takesC(y);
        takesD(x);
        takesD(y.makeD());
    }
}
