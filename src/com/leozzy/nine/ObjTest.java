package com.leozzy.nine;

/**
 * Created by Leo
 */
public class ObjTest {
    public static void main(String[] args) {
        Object o = new Object(){
            @Override
            public boolean equals(Object obj){
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }
}
