package com.leozzy.eleven;


import java.util.ArrayList;

/**
 * Created by Leo
 */

class Apple{
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }
}
class Orange{}

public class AppleAndOrangesWithoutGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList();
        for (int i =0 ;i < 3;i++){
            apples.add(new Apple());
        }
        //apples.add(new Orange());
        for (int i = 0; i < apples.size();i++){
            System.out.println(((Apple)(apples.get(i))).id());
        }
    }
}
