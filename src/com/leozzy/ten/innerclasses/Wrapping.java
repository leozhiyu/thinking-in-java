package com.leozzy.ten.innerclasses;

/**
 * Created by Leo
 */
public class Wrapping {
    private int i;
    public Wrapping(int x){
        i = x;
    }
    public int value(){
        System.out.println("外面得类");
        return i;
    }
}
