package com.leozzy.five;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.lang.reflect.Constructor;

/**
 * Created by Leo
 *
 * 1.this只能调用一个构造器
 * 2.构造器的调用必须是方法体的第一句git
 * 3.非构造方法不能使用调用构造器
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(){
        System.out.println("Constructor without param");
    }
    Flower(int petalCount){
        this.petalCount = petalCount;
        System.out.println("Constructor with param : int");
    }
    Flower(String s){
        this.s = s;
        System.out.println("Constructor with param : string ");
    }
    Flower(int petalCount,String s){
        this(petalCount);
        //this(s); 构造器在构造方法中只能调用一次
        this.s = s;
        //this(petalCount);  构造方法的调用必须位于第一行
        System.out.println("Constructor with two param : int String");
    }
    public void printPetalCount(){
        //this(petalCount);  非构造方法不能调用构造器
        System.out.println("petalCount : " + petalCount + ", String : " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }

}
