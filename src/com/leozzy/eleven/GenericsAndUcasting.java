package com.leozzy.eleven;

import java.util.ArrayList;

/**
 * Created by Leo
 */
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
public class GenericsAndUcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        for (Apple apple : apples){
            System.out.println(apple);
        }
    }
}
