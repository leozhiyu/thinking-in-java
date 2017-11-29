package com.leozzy.five;

import java.util.Date;

/**
 * Created by Leo
 */
public class OverloadingVarargs2 {
    static void f(float i, Character...characters){
        System.out.println("first");
        System.out.println(i);
        System.out.println(characters.length);
    }
    static void f(char c,Character... args){
        System.out.println("second");
    }

    public static void main(String[] args) {
        //f(1,'a');
        f('b','c');
    }
}
