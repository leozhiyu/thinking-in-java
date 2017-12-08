package com.leozzy.eight;

/**
 * Created by Leo
 */
public class Generator extends Base {
    @Override
    public void f2(){
        System.out.println("Generator.f2()");
    }

    public static void main(String[] args) {
        Generator g = new Generator();
        Base b = g;
        b.f2();
    }
}
