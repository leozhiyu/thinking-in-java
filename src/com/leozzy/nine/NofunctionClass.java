package com.leozzy.nine;


/**
 * Created by Leo
 */
abstract class BaseClass{
    BaseClass(int i){
        print();
    }
    public abstract void print();
}
public class NofunctionClass extends BaseClass{
    private int a = 3;
    NofunctionClass(){
        super(1);
    }
    @Override
    public void print(){
        System.out.println("a = " + a);
    }
    public static void main(String[] args) {
        NofunctionClass n = new NofunctionClass();
        n.print();
    }
}
