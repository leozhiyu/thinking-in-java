package com.leozzy.five;

/**
 * Created by Leo
 */
public class StringTest {

    public static void main(String[] args) {
        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a == b);
        System.out.println(a.intern() == b.intern());


    }
}
